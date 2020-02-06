package com.paga.business.rest.client.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MerchantInfo{

    private LegalEntity legalEntity;
    private LegalEntityRepresentative legalEntityRepresentative;
    private AdditionalParameters additionalParameters;

}
