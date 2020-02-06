package com.paga.business.rest.client.response;

public class RegisterCustomerResponse {

    private int responseCode;

    private String referenceNumber;

    private String message;

    private String errorMessage;

    public RegisterCustomerResponse() {
    }

    public RegisterCustomerResponse(int responseCode, String referenceNumber, String message, String errorMessage) {
        this.responseCode = responseCode;
        this.referenceNumber = referenceNumber;
        this.message = message;
        this.errorMessage = errorMessage;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
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

    @Override
    public String toString() {
        return "RegisterCustomerResponse{" +
                "responseCode='" + responseCode + '\'' +
                ", referenceNumber='" + referenceNumber + '\'' +
                ", message='" + message + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
