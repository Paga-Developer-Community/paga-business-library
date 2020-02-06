package com.paga.business.rest.client.request;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class AirtimePurchaseRequest {

    private String referenceNumber;
    private double amount;
    private String currency;
    private String destinationPhoneNumber;
    private String purchaserPrincipal;
    private String purchaserCredentials;
    private String mobileOperatorPublicId;
    private String sourceOfFunds;
    private String locale;
    private Boolean isSuppressRecipientMessages;
    private Integer networkOperatorId;
    private Boolean isDataBundle;
}
