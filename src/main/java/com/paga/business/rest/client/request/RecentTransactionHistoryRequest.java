package com.paga.business.rest.client.request;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class RecentTransactionHistoryRequest {
    private String referenceNumber;
    private String accountPrincipal;
    private String accountCredentials;
    private String locale;
}
