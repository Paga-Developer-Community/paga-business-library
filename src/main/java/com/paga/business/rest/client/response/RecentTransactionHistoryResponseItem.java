package com.paga.business.rest.client.response;

import java.util.Date;

public class RecentTransactionHistoryResponseItem {

    private int itemNumber;
    private String dateUTC;
    private String description;
    private double amount;
    private String status;
    private String transactionId;
    private String referenceNumber;

    public RecentTransactionHistoryResponseItem() {
    }

    public RecentTransactionHistoryResponseItem(int itemNumber, String dateUTC, String description, double amount,
                                                String status, String transactionId, String referenceNumber) {
        this.itemNumber = itemNumber;
        this.dateUTC = dateUTC;
        this.description = description;
        this.amount = amount;
        this.status = status;
        this.transactionId = transactionId;
        this.referenceNumber = referenceNumber;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getDateUTC() {
        return dateUTC;
    }

    public void setDateUTC(String dateUTC) {
        this.dateUTC = dateUTC;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    @Override
    public String toString() {
        return "RecentTransactionHistoryResponseItem{" +
                "itemNumber=" + itemNumber +
                ", dateUTC=" + dateUTC +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", referenceNumber='" + referenceNumber + '\'' +
                '}';
    }
}
