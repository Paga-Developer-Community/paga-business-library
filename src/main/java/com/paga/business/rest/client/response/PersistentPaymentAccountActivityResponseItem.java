package com.paga.business.rest.client.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class PersistentPaymentAccountActivityResponseItem {

    private int itemNumber;
    private String amount;
    private String currencyCode;
    private String paymentDate;
    private String paymentMethod;
    private String paymentReference;
    private String transactionReference;
    private String transactionServiceIdentifier;
    private String status;
    private String paymentBank;
    private String paymentFee;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String paymentError;
    private String paymentNarration;
    private String isInstantSettlement;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String instantSettlementAmount;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String instantSettlementFee;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String instantSettlementError;

}
