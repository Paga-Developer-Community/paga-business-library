package com.paga.business.rest.client.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdditionalParameters {

    private Date establishedDate;
    private String websiteUrl;
    private String displayName;

}
