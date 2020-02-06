package com.paga.business.rest.client.response;

import java.util.HashMap;
import java.util.Map;

public class OnboardingUpdate {

    private String status;

    private OnboardingCredentials credentials;


    public OnboardingUpdate() {
    }

    public OnboardingUpdate(String status, OnboardingCredentials credentials) {
        this.status = status;
        this.credentials = credentials;

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public OnboardingCredentials getCredentials() {
        return credentials;
    }

    public void setCredentials(OnboardingCredentials credentials) {
        this.credentials = credentials;
    }



    @Override
    public String toString() {
        return "OnboardingUpdate{" +
                "status='" + status + '\'' +
                ", credentials=" + credentials +
                '}';
    }
}
