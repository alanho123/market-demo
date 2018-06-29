
package com.ez.demo.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "responseId",
        "session",
        "queryResult",
        "originalDetectIntentRequest"
})
public class Webhook {

    @JsonProperty("responseId")
    private String responseId;
    @JsonProperty("session")
    private String session;
    @JsonProperty("queryResult")
    private QueryResult queryResult;
    @JsonProperty("originalDetectIntentRequest")
    private OriginalDetectIntentRequest originalDetectIntentRequest;

    @JsonProperty("responseId")
    public String getResponseId() {
        return responseId;
    }

    @JsonProperty("responseId")
    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    @JsonProperty("session")
    public String getSession() {
        return session;
    }

    @JsonProperty("session")
    public void setSession(String session) {
        this.session = session;
    }

    @JsonProperty("queryResult")
    public QueryResult getQueryResult() {
        return queryResult;
    }

    @JsonProperty("queryResult")
    public void setQueryResult(QueryResult queryResult) {
        this.queryResult = queryResult;
    }

    @JsonProperty("originalDetectIntentRequest")
    public OriginalDetectIntentRequest getOriginalDetectIntentRequest() {
        return originalDetectIntentRequest;
    }

    @JsonProperty("originalDetectIntentRequest")
    public void setOriginalDetectIntentRequest(OriginalDetectIntentRequest originalDetectIntentRequest) {
        this.originalDetectIntentRequest = originalDetectIntentRequest;
    }

}
