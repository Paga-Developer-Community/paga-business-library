package com.paga.business.rest.client.response;

public class MoneyTransferBulkResponseItem {

    private String referenceNumber;
    private String withdrawalCode;
    private String transactionId;
    private Double fee;
    private String receiverRegistrationStatus;
    private String currency;
    private Double exchangeRate;

    public MoneyTransferBulkResponseItem() {
    }

    public MoneyTransferBulkResponseItem(String referenceNumber, String withdrawalCode, String transactionId,
                                         Double fee, String receiverRegistrationStatus, String currency, Double exchangeRate) {
        this.referenceNumber = referenceNumber;
        this.withdrawalCode = withdrawalCode;
        this.transactionId = transactionId;
        this.fee = fee;
        this.receiverRegistrationStatus = receiverRegistrationStatus;
        this.currency = currency;
        this.exchangeRate = exchangeRate;
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

    @Override
    public String toString() {
        return "MoneyTransferBulkResponseItem{" +
                "referenceNumber='" + referenceNumber + '\'' +
                ", withdrawalCode='" + withdrawalCode + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", fee=" + fee +
                ", receiverRegistrationStatus='" + receiverRegistrationStatus + '\'' +
                ", currency='" + currency + '\'' +
                ", exchangeRate=" + exchangeRate +
                '}';
    }
}
