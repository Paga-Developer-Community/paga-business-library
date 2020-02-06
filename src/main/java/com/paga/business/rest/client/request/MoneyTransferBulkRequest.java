package com.paga.business.rest.client.request;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class MoneyTransferBulkRequest {
    private String bulkReferenceNumber;
    private List<MoneyTransferItem> moneyTransferItems;
}
