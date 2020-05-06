package com.paga.business.rest.client.request;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class GetMerchantAccountDetailRequest implements Serializable {

    private String merchantReferenceNumber;

    private String merchantAccount;

    private String referenceNumber;

    private String merchantServiceProductCode;
}
