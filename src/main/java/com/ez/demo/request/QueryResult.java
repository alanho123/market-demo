
package com.ez.demo.request;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author alanho123@gmail.com
 * @version 1.0
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "queryText",
        "action",
        "parameters",
        "allRequiredParamsPresent",
        "fulfillmentText",
        "fulfillmentMessages",
        "outputContexts",
        "intent",
        "intentDetectionConfidence",
        "diagnosticInfo",
        "languageCode"
})
public class QueryResult {

    @JsonProperty("queryText")
    private String queryText;
    @JsonProperty("action")
    private String action;

//    @JsonProperty("parameters")
//    private Parameters parameters;

    @JsonProperty("allRequiredParamsPresent")
    private Boolean allRequiredParamsPresent;
    @JsonProperty("fulfillmentText")
    private String fulfillmentText;
    @JsonProperty("fulfillmentMessages")
    private List<FulfillmentMessage> fulfillmentMessages = null;
    @JsonProperty("outputContexts")
    private List<OutputContext> outputContexts = null;
    @JsonProperty("intent")
    private Intent intent;
    @JsonProperty("intentDetectionConfidence")
    private Integer intentDetectionConfidence;
    @JsonProperty("diagnosticInfo")
    private DiagnosticInfo diagnosticInfo;
    @JsonProperty("languageCode")
    private String languageCode;

    @JsonProperty("parameters")
    private Map<String, String> parameters;

    @JsonAnySetter
    private void add(String key, String value) {
        parameters.put(key, value);
    }

    @JsonAnyGetter
    public Map<String, String> getParameters() {
        return parameters;
    }

    @JsonProperty("queryText")
    public String getQueryText() {
        return queryText;
    }

    @JsonProperty("queryText")
    public void setQueryText(String queryText) {
        this.queryText = queryText;
    }

    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

//    @JsonProperty("parameters")
//    public Parameters getParameters() {
//        return parameters;
//    }
//
//    @JsonProperty("parameters")
//    public void setParameters(Parameters parameters) {
//        this.parameters = parameters;
//    }

    @JsonProperty("allRequiredParamsPresent")
    public Boolean getAllRequiredParamsPresent() {
        return allRequiredParamsPresent;
    }

    @JsonProperty("allRequiredParamsPresent")
    public void setAllRequiredParamsPresent(Boolean allRequiredParamsPresent) {
        this.allRequiredParamsPresent = allRequiredParamsPresent;
    }

    @JsonProperty("fulfillmentText")
    public String getFulfillmentText() {
        return fulfillmentText;
    }

    @JsonProperty("fulfillmentText")
    public void setFulfillmentText(String fulfillmentText) {
        this.fulfillmentText = fulfillmentText;
    }

    @JsonProperty("fulfillmentMessages")
    public List<FulfillmentMessage> getFulfillmentMessages() {
        return fulfillmentMessages;
    }

    @JsonProperty("fulfillmentMessages")
    public void setFulfillmentMessages(List<FulfillmentMessage> fulfillmentMessages) {
        this.fulfillmentMessages = fulfillmentMessages;
    }

    @JsonProperty("outputContexts")
    public List<OutputContext> getOutputContexts() {
        return outputContexts;
    }

    @JsonProperty("outputContexts")
    public void setOutputContexts(List<OutputContext> outputContexts) {
        this.outputContexts = outputContexts;
    }

    @JsonProperty("intent")
    public Intent getIntent() {
        return intent;
    }

    @JsonProperty("intent")
    public void setIntent(Intent intent) {
        this.intent = intent;
    }

    @JsonProperty("intentDetectionConfidence")
    public Integer getIntentDetectionConfidence() {
        return intentDetectionConfidence;
    }

    @JsonProperty("intentDetectionConfidence")
    public void setIntentDetectionConfidence(Integer intentDetectionConfidence) {
        this.intentDetectionConfidence = intentDetectionConfidence;
    }

    @JsonProperty("diagnosticInfo")
    public DiagnosticInfo getDiagnosticInfo() {
        return diagnosticInfo;
    }

    @JsonProperty("diagnosticInfo")
    public void setDiagnosticInfo(DiagnosticInfo diagnosticInfo) {
        this.diagnosticInfo = diagnosticInfo;
    }

    @JsonProperty("languageCode")
    public String getLanguageCode() {
        return languageCode;
    }

    @JsonProperty("languageCode")
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public QueryResult() {
        parameters = new HashMap<>();
    }

}
