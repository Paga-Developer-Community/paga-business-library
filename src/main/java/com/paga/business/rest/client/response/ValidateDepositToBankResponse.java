package com.paga.business.rest.client.response;

public class ValidateDepositToBankResponse {

    private String referenceNumber;
    private Double fee;
    private Double vat;
    private String destinationAccountHolderNameAtBank;
    private int responseCode;
    private String message;

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
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



    public ValidateDepositToBankResponse() {
    }

    public ValidateDepositToBankResponse(String referenceNumber, Double fee, Double vat,
                                         String destinationAccountHolderNameAtBank, int responseCode,
                                         String message) {
        this.referenceNumber = referenceNumber;
        this.fee = fee;
        this.vat = vat;
        this.destinationAccountHolderNameAtBank = destinationAccountHolderNameAtBank;
        this.responseCode = responseCode;
        this.message = message;

    }

    @Override
    public String toString() {
        return "ValidateDepositToBankResponse{" +
                "referenceNumber='" + referenceNumber + '\'' +
                ", fee=" + fee +
                ", vat=" + vat +
                ", destinationAccountHolderNameAtBank='" + destinationAccountHolderNameAtBank + '\'' +
                ", responseCode=" + responseCode +
                ", message='" + message + '\'' +
                '}';
    }
}
