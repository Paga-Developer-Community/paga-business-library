package com.paga.business.rest.client.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class MoneyTransferRequest {
    private String referenceNumber;
    private double amount;
    private String currency;
    private String destinationAccount;
    private String destinationBank;
    private String senderPrincipal;
    private String senderCredentials;
    private Boolean sendWithdrawalCode;
    private String transferReference;
    private String sourceOfFunds;
    private Boolean suppressRecipientMessage;
    private String locale;
    private String alternateSenderName;

    private String minRecipientKYCLevel;
    private Integer holdingPeriod;
    private Boolean sendAtmWithdrawalCodes;
}
