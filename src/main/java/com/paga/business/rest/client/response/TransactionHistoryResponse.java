package com.paga.business.rest.client.response;

import java.util.ArrayList;
import java.util.List;

public class TransactionHistoryResponse {

    private String referenceNumber;
    private int recordCount;
    private List<TransactionHistoryResponseItem> items = new ArrayList<TransactionHistoryResponseItem>();
    private String currency;
    private int responseCode;
    private String message;

    public TransactionHistoryResponse() {
    }

    public TransactionHistoryResponse(String referenceNumber, int recordCount, List<TransactionHistoryResponseItem> items,
                                      String currency, int responseCode, String message) {
        this.referenceNumber = referenceNumber;
        this.recordCount = recordCount;
        this.items = items;
        this.currency = currency;
        this.responseCode = responseCode;
        this.message = message;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public int getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    public List<TransactionHistoryResponseItem> getItems() {
        return items;
    }

    public void setItems(List<TransactionHistoryResponseItem> items) {
        this.items = items;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
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
        return "TransactionHistoryResponse{" +
                "referenceNumber='" + referenceNumber + '\'' +
                ", recordCount=" + recordCount +
                ", items=" + items +
                ", currency='" + currency + '\'' +
                ", responseCode=" + responseCode +
                ", message='" + message + '\'' +
                '}';
    }
}
