package com.paga.business.rest.client.response;

public class MoneyTransferResponse {

    private String referenceNumber;
    private String withdrawalCode;
    private String transactionId;
    private String currency;
    private Double exchangeRate;
    private String message;
    private Double fee;
    private String receiverRegistrationStatus;
    private Integer atmCode;
    private String atmWithdrawalReferenceNumber;
    private int responseCode;


    public MoneyTransferResponse() {
    }

    public MoneyTransferResponse(String referenceNumber, String withdrawalCode, String transactionId, String currency,
                                 Double exchangeRate, Double fee, String receiverRegistrationStatus, Integer atmCode,String message,
                                 String atmWithdrawalReferenceNumber, int responseCode) {
        this.referenceNumber = referenceNumber;
        this.withdrawalCode = withdrawalCode;
        this.transactionId = transactionId;
        this.currency = currency;
        this.exchangeRate = exchangeRate;
        this.fee = fee;
        this.receiverRegistrationStatus = receiverRegistrationStatus;
        this.atmCode = atmCode;
        this.atmWithdrawalReferenceNumber = atmWithdrawalReferenceNumber;
        this.responseCode = responseCode;
        this.message = message;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getWithdrawalCode() {
        return withdrawalCode;
    }

    public void setWithdrawalCode(String withdrawalCode) {
        this.withdrawalCode = withdrawalCode;
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

    public String getReceiverRegistrationStatus() {
        return receiverRegistrationStatus;
    }

    public void setReceiverRegistrationStatus(String receiverRegistrationStatus) {
        this.receiverRegistrationStatus = receiverRegistrationStatus;
    }

    public Integer getAtmCode() {
        return atmCode;
    }

    public void setAtmCode(Integer atmCode) {
        this.atmCode = atmCode;
    }

    public String getAtmWithdrawalReferenceNumber() {
        return atmWithdrawalReferenceNumber;
    }

    public void setAtmWithdrawalReferenceNumber(String atmWithdrawalReferenceNumber) {
        this.atmWithdrawalReferenceNumber = atmWithdrawalReferenceNumber;
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
        return "MoneyTransferResponse{" +
                "referenceNumber='" + referenceNumber + '\'' +
                ", withdrawalCode='" + withdrawalCode + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", currency='" + currency + '\'' +
                ", exchangeRate=" + exchangeRate +
                ", message='" + message + '\'' +
                ", fee=" + fee +
                ", receiverRegistrationStatus='" + receiverRegistrationStatus + '\'' +
                ", atmCode=" + atmCode +
                ", atmWithdrawalReferenceNumber='" + atmWithdrawalReferenceNumber + '\'' +
                ", responseCode='" + responseCode + '\'' +
                '}';
    }
}
