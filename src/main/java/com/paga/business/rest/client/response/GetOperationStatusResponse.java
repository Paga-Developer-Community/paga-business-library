package com.paga.business.rest.client.response;

public class GetOperationStatusResponse {

    private String referenceNumber;
    private String transactionId;
    private Double fee;
    private String transactionStatus;
    private String message;
    private int responseCode;

    public GetOperationStatusResponse() {
    }

    public GetOperationStatusResponse(String referenceNumber, String transactionId, Double fee, String transactionStatus,
                                      String message, int responseCode) {
        this.referenceNumber = referenceNumber;
        this.transactionId = transactionId;
        this.fee = fee;
        this.transactionStatus = transactionStatus;
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

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
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
        return "GetOperationStatusResponse{" +
                "referenceNumber='" + referenceNumber + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", fee=" + fee +
                ", transactionStatus='" + transactionStatus + '\'' +
                ", message='" + message + '\'' +
                ", responseCode=" + responseCode +
                '}';
    }
}
