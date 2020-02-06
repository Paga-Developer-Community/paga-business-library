package com.paga.business.rest.client.response;

import java.util.ArrayList;
import java.util.List;

public class RecentTransactionHistoryResponse {

    private String referenceNumber;
    private int recordCount;
    private List<RecentTransactionHistoryResponseItem> items = new ArrayList<RecentTransactionHistoryResponseItem>();
    private String currency;
    private int responseCode;
    private String message;

    public RecentTransactionHistoryResponse() {
    }

    public RecentTransactionHistoryResponse(String referenceNumber, int recordCount, List<RecentTransactionHistoryResponseItem> items,
                                            String currency,  int responseCode, String message) {
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

    public List<RecentTransactionHistoryResponseItem> getItems() {
        return items;
    }

    public void setItems(List<RecentTransactionHistoryResponseItem> items) {
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
        return "RecentTransactionHistoryResponse{" +
                "referenceNumber='" + referenceNumber + '\'' +
                ", recordCount=" + recordCount +
                ", items=" + items +
                ", currency='" + currency + '\'' +
                ", responseCode=" + responseCode +
                ", message='" + message + '\'' +
                '}';
    }
}
