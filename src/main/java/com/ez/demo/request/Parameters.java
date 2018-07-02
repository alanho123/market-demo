
package com.ez.demo.request;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author alanho123@gmail.com
 * @version 1.0
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Parameters {

    private String paramters;

    public String getParamters() {
        return paramters;
    }

    public void setParamters(String paramters) {
        this.paramters = paramters;
    }
}
