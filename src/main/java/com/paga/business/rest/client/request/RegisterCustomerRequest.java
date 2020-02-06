package com.paga.business.rest.client.request;

import lombok.*;

import java.io.File;
import java.util.Date;
import java.util.Map;

@Builder
@Data
@EqualsAndHashCode(callSuper = false)
public class RegisterCustomerRequest {


    private String referenceNumber;

    private String customerPhoneNumber;
    private String customerFirstName;
    private String customerLastName;
    private String customerEmail;
    private Date customerDateOfBirth;
    private String customerGender;
    private Address customerAddress;

    private String customerMaritalStatus;
    private String customerPreferredLanguageISOCode;

    private String customerReferredByFirstName;
    private String customerReferredByLastName;
    private String customerReferredByPhoneNumber;

    private String customerIdType;
    private String customerIdNumber;
    private String customerIdExpirationDate;

    private Boolean optinForWalletSavings;

    private Map<String, String> customerSupplementaryDetails;

    private File customerAccountPhoto;

    private File customerIdentification;

    @Builder
    @Data
    public static class Address {

        private String country;
        private String region;
        private String county;
        private String city;
        private String localGovernmentArea;
        private String streetAddress;
        private String postalCode;
        private String landmark;
        private String freeformAddress;

    }
}