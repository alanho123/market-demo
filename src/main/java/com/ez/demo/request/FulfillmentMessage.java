
package com.ez.demo.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author alanho123@gmail.com
 * @version 1.0
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "text"
})
public class FulfillmentMessage {

    @JsonProperty("text")
    private Text text;

    @JsonProperty("text")
    public Text getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(Text text) {
        this.text = text;
    }

}
