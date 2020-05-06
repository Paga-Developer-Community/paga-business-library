package com.paga.business.rest.client.response;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class GetMerchantAccountDetailResponse implements Serializable {

    private String phoneNumber;

    private Details details;

    private String message;

    private String accountNumber;

    private String customerName;

    private String responseCode;
}
