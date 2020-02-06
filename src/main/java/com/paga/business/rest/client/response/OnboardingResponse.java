package com.paga.business.rest.client.response;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashMap;
import java.util.Map;

public class OnboardingResponse {

    private OnboardingUpdate onboardingUpdate;

    private int responseCode;
    private String message;

    public OnboardingResponse() {
    }

    public OnboardingResponse(OnboardingUpdate onboardingUpdate, int responseCode, String message) {
        this.onboardingUpdate = onboardingUpdate;
        this.responseCode = responseCode;
        this.message = message;
    }

    public OnboardingUpdate getOnboardingUpdate() {
        return onboardingUpdate;
    }

    public void setOnboardingUpdate(OnboardingUpdate onboardingUpdate) {
        this.onboardingUpdate = onboardingUpdate;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "OnboardingResponse{" +
                "onboardingUpdate=" + onboardingUpdate +
                ", responseCode=" + responseCode +
                ", message='" + message + '\'' +
                '}';
    }
}
