
package com.ez.demo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author alanho123@gmail.com
 * @version 1.0
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "交易日期",
        "作物代號",
        "作物名稱",
        "市場代號",
        "市場名稱",
        "上價:",
        "中價",
        "下價",
        "平均價",
        "交易量"
})
public class Data {

    @JsonProperty("交易日期")
    private String txDate;

    @JsonProperty("作物代號")
    private String cropCode;

    @JsonProperty("作物名稱")
    private String cropName;

    @JsonProperty("市場代號")
    private String marketCode;

    @JsonProperty("市場名稱")
    private String marketName;

    @JsonProperty("上價")
    private double price1;

    @JsonProperty("中價")
    private double price2;

    @JsonProperty("下價")
    private double price3;

    @JsonProperty("平均價")
    private double avgPrice;

    @JsonProperty("交易量")
    private int qty;

    public String getTxDate() {
        return txDate;
    }

    public void setTxDate(String txDate) {
        this.txDate = txDate;
    }

    public String getCropCode() {
        return cropCode;
    }

    public void setCropCode(String cropCode) {
        this.cropCode = cropCode;
    }

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    public String getMarketCode() {
        return marketCode;
    }

    public void setMarketCode(String marketCode) {
        this.marketCode = marketCode;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public double getPrice1() {
        return price1;
    }

    public void setPrice1(double price1) {
        this.price1 = price1;
    }

    public double getPrice2() {
        return price2;
    }

    public void setPrice2(double price2) {
        this.price2 = price2;
    }

    public double getPrice3() {
        return price3;
    }

    public void setPrice3(double price3) {
        this.price3 = price3;
    }

    public double getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(double avgPrice) {
        this.avgPrice = avgPrice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Data{" +
                "txDate='" + txDate + '\'' +
                ", cropCode='" + cropCode + '\'' +
                ", cropName='" + cropName + '\'' +
                ", marketCode='" + marketCode + '\'' +
                ", marketName='" + marketName + '\'' +
                ", price1=" + price1 +
                ", price2=" + price2 +
                ", price3=" + price3 +
                ", avgPrice=" + avgPrice +
                ", qty=" + qty +
                '}';
    }
}
