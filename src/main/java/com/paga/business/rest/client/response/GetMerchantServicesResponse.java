package com.paga.business.rest.client.response;

import java.util.ArrayList;
import java.util.List;

public class GetMerchantServicesResponse {

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public List<GetMerchantServicesResponseItem> getServices() {
        return services;
    }

    public void setServices(List<GetMerchantServicesResponseItem> services) {
        this.services = services;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String referenceNumber;
    private List<GetMerchantServicesResponseItem> services = new ArrayList<GetMerchantServicesResponseItem>();
    private int responseCode;
    private String message;

    public GetMerchantServicesResponse() {
    }

    public GetMerchantServicesResponse(String referenceNumber, List<GetMerchantServicesResponseItem> services,
                                       int responseCode, String message) {
        this.referenceNumber = referenceNumber;
        this.services = services;
        this.responseCode = responseCode;
        this.message = message;
    }


    @Override
    public String toString() {
        return "GetMerchantServicesResponse{" +
                "referenceNumber='" + referenceNumber + '\'' +
                ", services=" + services +
                ", responseCode=" + responseCode +
                ", message='" + message + '\'' +
                '}';
    }
}
