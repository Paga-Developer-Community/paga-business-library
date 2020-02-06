package com.paga.business.rest.client.request;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class ValidateDepositToBankRequest {

    private String referenceNumber;
    private double amount;
    private String currency;
    private String destinationBankUUID;
    private String destinationBankAccountNumber;
    private String recipientPhoneNumber;
    private String recipientMobileOperatorCode;
    private String recipientEmail;
    private String recipientName;
    private String locale;
}
