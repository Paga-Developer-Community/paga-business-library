package com.paga.business.rest.client.request;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class TransactionHistoryRequest {
    private String referenceNumber;
    private String accountPrincipal;
    private String accountCredentials;
    private Date startDateUTC;
    private Date endDateUTC;
    private String locale;
}
