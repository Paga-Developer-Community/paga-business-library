package com.paga.business.rest.client.response;


import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class PersistentPaymentAccountActivityResponse {

    private String referenceNumber;
    private int recordCount;
    private String accountReference;
    private String accountNumber;
    private String accountName;
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private String email;
    private String financialIdentificationNumber;

    private List<PersistentPaymentAccountActivityResponseItem> items = new ArrayList<>();
}
