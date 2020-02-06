package com.paga.business.rest.client.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LegalEntity {
    private String addressCountry;
    private String addressZip;
    private String name;
    private String description;
    private String addressLine1;
    private String addressLine2;
    private String addressState;
    private String addressCity;
}
