package com.paga.business.rest.client.response;

import java.util.List;

public class MoneyTransferBulkResponse {

    private String bulkReferenceNumber;
    private List<MoneyTransferBulkResponseItem> results;
    private String message;
    private int responseCode;


    public MoneyTransferBulkResponse() {
    }

    public MoneyTransferBulkResponse(String bulkReferenceNumber, List<MoneyTransferBulkResponseItem> results,
                                     String message, int responseCode) {
        this.bulkReferenceNumber = bulkReferenceNumber;
        this.results = results;
        this.message = message;
        this.responseCode = responseCode;

    }

    public String getBulkReferenceNumber() {
        return bulkReferenceNumber;
    }

    public void setBulkReferenceNumber(String bulkReferenceNumber) {
        this.bulkReferenceNumber = bulkReferenceNumber;
    }

    public List<MoneyTransferBulkResponseItem> getResults() {
        return results;
    }

    public void setResults(List<MoneyTransferBulkResponseItem> results) {
        this.results = results;
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
        return "MoneyTransferBulkResponse{" +
                "bulkReferenceNumber='" + bulkReferenceNumber + '\'' +
                ", results=" + results +
                ", message='" + message + '\'' +
                ", responseCode=" + responseCode +
                '}';
    }
}
