package com.paga.business.rest.client.response;

public class ValidateCustomerResponse {

    private String referenceNumber;
    private String customerIdentifier;
    private String identifierType;
    private String name;
    private String kycLevel;

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getCustomerIdentifier() {
        return customerIdentifier;
    }

    public void setCustomerIdentifier(String customerIdentifier) {
        this.customerIdentifier = customerIdentifier;
    }

    public String getIdentifierType() {
        return identifierType;
    }

    public void setIdentifierType(String identifierType) {
        this.identifierType = identifierType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKycLevel() {
        return kycLevel;
    }

    public void setKycLevel(String kycLevel) {
        this.kycLevel = kycLevel;
    }

    @Override
    public String toString() {
        return "ValidateCustomerResponse{" +
                "referenceNumber='" + referenceNumber + '\'' +
                ", customerIdentifier='" + customerIdentifier + '\'' +
                ", identifierType='" + identifierType + '\'' +
                ", name='" + name + '\'' +
                ", kycLevel='" + kycLevel + '\'' +
                '}';
    }
}
