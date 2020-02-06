package com.paga.business.rest.client.request;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class AccountBalanceRequest {

    private String referenceNumber;
    private String accountPrincipal;
    private String accountCredentials;
    private String sourceOfFunds;
    private String locale;
}
