package com.paga.business.rest.client.request;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Date;


@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class PersistentPaymentAccountActivityRequest {

    private String referenceNumber;
    private String accountReference;
    private String accountNumber;
    private Boolean getLatestSingleActivity;
    private Date startDate;
    private Date endDate;
}
