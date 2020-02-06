package com.paga.business.rest.client.response;

public class GetKYCRestrictedMoneyTransferResponse {

    private String referenceNumber;
    private String transactionStatus;
    private int responseCode;
    private String message;

    public GetKYCRestrictedMoneyTransferResponse() {
    }

    public GetKYCRestrictedMoneyTransferResponse(String referenceNumber, String transactionStatus,
                                                 int responseCode, String message) {
        this.referenceNumber = referenceNumber;
        this.transactionStatus = transactionStatus;
        this.responseCode = responseCode;
        this.message = message;
    }


    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
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
        return "GetKYCRestrictedMoneyTransferResponse{" +
                "referenceNumber='" + referenceNumber + '\'' +
                ", transactionStatus='" + transactionStatus + '\'' +
                ", responseCode=" + responseCode +
                ", message='" + message + '\'' +
                '}';
    }
}
