package com.paga.business.rest.client.response;

public class GetMerchantServicesResponseItem {

    private String name;
    private String code;
    private Double price;
    private String shortCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public GetMerchantServicesResponseItem() {
    }

    public GetMerchantServicesResponseItem(String name, String code, Double price, String shortCode) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.shortCode = shortCode;
    }

    @Override
    public String toString() {
        return "GetMerchantServicesResponseItem{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", price=" + price +
                ", shortCode='" + shortCode + '\'' +
                '}';
    }
}
