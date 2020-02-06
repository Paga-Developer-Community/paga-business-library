package com.paga.business.rest.client.request;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class GetOperationStatusRequest {
    private String referenceNumber;
    private String locale;

}
