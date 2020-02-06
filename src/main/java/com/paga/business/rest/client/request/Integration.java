package com.paga.business.rest.client.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Integration {

    private String financeAdminEmail;
    private String type;
    private String callbackUrl;
    private String username;
    private String password;

}
