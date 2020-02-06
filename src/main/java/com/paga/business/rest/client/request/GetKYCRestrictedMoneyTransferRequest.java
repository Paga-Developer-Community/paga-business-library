package com.paga.business.rest.client.request;

import lombok.*;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class GetKYCRestrictedMoneyTransferRequest {

    private String referenceNumber;
}
