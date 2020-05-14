package com.paga.business.rest.client.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Map;

public class MerchantPaymentResponse {

    private String referenceNumber;
    private String merchantTransactionReference;
    private String transactionId;
    private String  currency;
    private Double exchangeRate;
    private Double fee;
    private int responseCode;
    private String message;

    private Map<String, Object> additionalProperties;

    public MerchantPaymentResponse() {
    }

    public MerchantPaymentResponse(String referenceNumber, String merchantTransactionReference, String transactionId,
                                   String currency, Double exchangeRate, Double fee, int responseCode, String message) {
        this.referenceNumber = referenceNumber;
        this.merchantTransactionReference = merchantTransactionReference;
        this.transactionId = transactionId;
        this.currency = currency;
        this.exchangeRate = exchangeRate;
        this.fee = fee;
        this.responseCode = responseCode;
        this.message = message;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getMerchantTransactionReference() {
        return merchantTransactionReference;
    }

    public void setMerchantTransactionReference(String merchantTransactionReference) {
        this.merchantTransactionReference = merchantTransactionReference;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @Override
    public String toString() {
        return "MerchantPaymentResponse{" +
                "referenceNumber='" + referenceNumber + '\'' +
                ", merchantTransactionReference='" + merchantTransactionReference + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", currency='" + currency + '\'' +
                ", exchangeRate=" + exchangeRate +
                ", fee=" + fee +
                ", responseCode=" + responseCode +
                ", message='" + message + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
