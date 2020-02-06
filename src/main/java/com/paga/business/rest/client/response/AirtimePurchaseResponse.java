package com.paga.business.rest.client.response;

public class AirtimePurchaseResponse {

    private String referenceNumber;
    private String transactionId;
    private String currency;
    private Double exchangeRate;
    private String message;
    private int responseCode;

    public AirtimePurchaseResponse() {
    }

    public AirtimePurchaseResponse(String referenceNumber, String transactionId, String currency, Double exchangeRate,
                                   String message, int responseCode) {
        this.referenceNumber = referenceNumber;
        this.transactionId = transactionId;
        this.currency = currency;
        this.exchangeRate = exchangeRate;
        this.message = message;
        this.responseCode = responseCode;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    @Override
    public String toString() {
        return "AirtimePurchaseResponse{" +
                "referenceNumber='" + referenceNumber + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", currency='" + currency + '\'' +
                ", exchangeRate=" + exchangeRate +
                ", message='" + message + '\'' +
                ", responseCode=" + responseCode +
                '}';
    }
}
