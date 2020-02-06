package com.paga.business.rest.client.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OnboardMerchantRequest {


    private String reference;
    private String merchantExternalId;
    private MerchantInfo merchantInfo;
    private Integration integration;
}
