package com.paga.business.rest.client.request;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.Map;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class MerchantPaymentRequest {

    private String referenceNumber;
    private double amount;
    private String currency;
    private String merchantAccount;
    private String merchantReferenceNumber;
    private List<String> merchantService;
    private String purchaserPrincipal;
    private String purchaserCredentials;
    private String sourceOfFunds;
    private String locale;
    private Map<String, String> externalData;

}
