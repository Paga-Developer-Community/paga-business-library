package com.paga.business.rest.client.response;

public class DepositToBankResponse {
    private String referenceNumber;
    private String transactionId;
    private String currency;
    private Double exchangeRate;
    private Double fee;

    private Double vat;
    private String destinationAccountHolderNameAtBank;

    private int responseCode;
    private String message;
    private String errorMessage;

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

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public Double getVat() {
        return vat;
    }

    public void setVat(Double vat) {
        this.vat = vat;
    }

    public String getDestinationAccountHolderNameAtBank() {
        return destinationAccountHolderNameAtBank;
    }

    public void setDestinationAccountHolderNameAtBank(String destinationAccountHolderNameAtBank) {
        this.destinationAccountHolderNameAtBank = destinationAccountHolderNameAtBank;
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

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public DepositToBankResponse() {
    }

    public DepositToBankResponse(String referenceNumber, String transactionId, String currency, Double exchangeRate,
                                 Double fee, Double vat, String destinationAccountHolderNameAtBank, int responseCode,
                                 String message, String errorMessage) {
        this.referenceNumber = referenceNumber;
        this.transactionId = transactionId;
        this.currency = currency;
        this.exchangeRate = exchangeRate;
        this.fee = fee;
        this.vat = vat;
        this.destinationAccountHolderNameAtBank = destinationAccountHolderNameAtBank;
        this.responseCode = responseCode;
        this.message = message;
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "DepositToBankResponse{" +
                "referenceNumber='" + referenceNumber + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", currency='" + currency + '\'' +
                ", exchangeRate=" + exchangeRate +
                ", fee=" + fee +
                ", vat=" + vat +
                ", destinationAccountHolderNameAtBank='" + destinationAccountHolderNameAtBank + '\'' +
                ", responseCode=" + responseCode +
                ", message='" + message + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
