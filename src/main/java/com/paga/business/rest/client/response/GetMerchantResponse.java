package com.paga.business.rest.client.response;

import java.util.ArrayList;
import java.util.List;

public class GetMerchantResponse {

    private String referenceNumber;
    private List<GetMerchantsResponseItem> merchants = new ArrayList<GetMerchantsResponseItem>();
    private int responseCode;
    private String message;

    public GetMerchantResponse() {
    }

    public GetMerchantResponse(String referenceNumber, List<GetMerchantsResponseItem> merchants, int responseCode, String message) {
        this.referenceNumber = referenceNumber;
        this.merchants = merchants;
        this.responseCode = responseCode;
        this.message = message;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public List<GetMerchantsResponseItem> getMerchants() {
        return merchants;
    }

    public void setMerchants(List<GetMerchantsResponseItem> merchants) {
        this.merchants = merchants;
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

    @Override
    public String toString() {
        return "GetMerchantResponse{" +
                "referenceNumber='" + referenceNumber + '\'' +
                ", merchants=" + merchants +
                ", responseCode=" + responseCode +
                ", message='" + message + '\'' +
                '}';
    }
}
