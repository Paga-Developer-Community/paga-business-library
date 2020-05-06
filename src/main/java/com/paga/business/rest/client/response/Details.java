package com.paga.business.rest.client.response;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class Details implements Serializable {

    private String firstName;

    private String lastName;

    private String customerName;

    private String merchantAccountDetails;
}
