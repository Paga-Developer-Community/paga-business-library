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
public class LegalEntityRepresentative {
    private String firstName;
    private String phone;
    private String lastName;
    private String email;
    private Date dateOfBirth;
}
