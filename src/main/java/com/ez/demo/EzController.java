package com.ez.demo;

import com.ez.demo.request.Webhook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
public class EzController {
    private static final Logger logger = LoggerFactory.getLogger(EzController.class);

    @Value("${api.url}")
    private String apiUrl;

    @PostMapping("/market/pricing")
    public MarketData pricing(@RequestBody Webhook webhook) {
        String queryText = webhook.getQueryResult().getQueryText();
        String action = webhook.getQueryResult().getAction();
        logger.info("######### Query Text  - {}, Action - {}, Parameters - {}", queryText, action, webhook.getQueryResult().getParameters());
        MarketData marketData = new MarketData();
        marketData.setFulfillmentText("很抱歉查不到資料");

        if (action != null && action.toLowerCase().equals("pricing")) {
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
            logger.info("####### API URL- {}", apiUrl);
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<Data[]> response = restTemplate
                    .exchange(apiUrl, HttpMethod.GET, entity, Data[].class);
            logger.info("####### response - {}", response);
            Data lowest = null;
            if (response != null && response.getStatusCodeValue() == 200) {
                logger.info("##### Data Size - {}", response.getBody().length);
                for (Data data : response.getBody()) {
                    if (data.getCropName().contains(queryText)) {
                        if (lowest == null || data.getAvgPrice() < lowest.getAvgPrice()) {
                            lowest = data;
                        }
                    }
                }
                if(lowest != null) {
                    marketData.setFulfillmentText(lowest.getMarketName()+"最便宜，平均價："+lowest.getAvgPrice());
                }
            }
        }
        return marketData;
    }

//    @PostMapping("/market/pricing")
//    public ResponseData pricing(@RequestBody Webhook webhook) {
//        ResponseData responseData = new ResponseData();
//        responseData.setFulfillmentText("很抱歉查不到你的資料");
//
//        String queryText = webhook.getQueryResult().getQueryText();
//        String action = webhook.getQueryResult().getAction();
//
//        if (action != null && action.toLowerCase().equals("pricing")) {
//            HttpHeaders headers = new HttpHeaders();
//            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//            HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
//            logger.info("####### API URL- {}", apiUrl);
//            RestTemplate restTemplate = new RestTemplate();
//            ResponseEntity<Data[]> response = restTemplate
//                    .exchange(apiUrl, HttpMethod.GET, entity, Data[].class);
//            logger.info("####### response - {}", response);
//            if (response != null && response.getStatusCodeValue() == 200) {
//                logger.info("##### Data Size - {}", response.getBody().length);
//                StringBuilder sb = new StringBuilder();
//                for (Data data : response.getBody()) {
//                    if (data.getCropName().contains("椰子")) {
//                        logger.info("### data - {}", data);
//                        sb.append(data.getMarketName()).append("：").append(data.getAvgPrice());
//                    }
//                }
//                logger.info("### result - {}", sb.toString());
//                if (!StringUtils.isEmpty(sb.toString())) {
//                    responseData.setFulfillmentText(sb.toString());
//                }
//            }
//        }
//        return responseData;
//    }
}
