package com.paga.business.rest.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

public class OnboardingCredentials {


    private String merchantPublicId;

    private String merchantSecretKey;

    private String merchantHmac;



    public OnboardingCredentials() {
    }

    public OnboardingCredentials(String merchantPublicId, String merchantSecretKey, String merchantHmac) {
        this.merchantPublicId = merchantPublicId;
        this.merchantSecretKey = merchantSecretKey;
        this.merchantHmac = merchantHmac;

    }


    public String getMerchantPublicId() {
        return merchantPublicId;
    }


    public void setMerchantPublicId(String merchantPublicId) {
        this.merchantPublicId = merchantPublicId;
    }

    @JsonProperty("merchantSecretKey")
    public String getMerchantSecretKey() {
        return merchantSecretKey;
    }

    @JsonProperty("merchantSecretKey")
    public void setMerchantSecretKey(String merchantSecretKey) {
        this.merchantSecretKey = merchantSecretKey;
    }

    @JsonProperty("merchantHmac")
    public String getMerchantHmac() {
        return merchantHmac;
    }

    public void setMerchantHmac(String merchantHmac) {
        this.merchantHmac = merchantHmac;
    }



    @Override
    public String toString() {
        return "OnboardingCredentials{" +
                "merchantPublicId='" + merchantPublicId + '\'' +
                ", merchantSecretKey='" + merchantSecretKey + '\'' +
                ", merchantHmac='" + merchantHmac + '\'' +
                '}';
    }
}
