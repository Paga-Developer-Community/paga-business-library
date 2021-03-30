package com.paga.business.rest.client.request;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class RegisterPersistentPaymentAccountRequest {

    private String referenceNumber;
    private String accountReference;
    private String accountName;
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private String email;
    private String financialIdentificationNumber;

}
