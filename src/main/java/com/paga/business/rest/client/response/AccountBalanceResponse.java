package com.paga.business.rest.client.response;

import java.util.Date;

public class AccountBalanceResponse {

    private String referenceNumber;
    private String totalBalance;
    private String availableBalance;
    private String currency;
    private Date balanceDateTimeUTC;
    private int responseCode;
    private String message;

    public AccountBalanceResponse() {
    }

    public AccountBalanceResponse(String referenceNumber, String totalBalance, String availableBalance, String currency,
                                  Date balanceDateTimeUTC, int responseCode, String message) {
        this.referenceNumber = referenceNumber;
        this.totalBalance = totalBalance;
        this.availableBalance = availableBalance;
        this.currency = currency;
        this.balanceDateTimeUTC = balanceDateTimeUTC;
        this.responseCode = responseCode;
        this.message = message;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(String totalBalance) {
        this.totalBalance = totalBalance;
    }

    public String getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(String availableBalance) {
        this.availableBalance = availableBalance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Date getBalanceDateTimeUTC() {
        return balanceDateTimeUTC;
    }

    public void setBalanceDateTimeUTC(Date balanceDateTimeUTC) {
        this.balanceDateTimeUTC = balanceDateTimeUTC;
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
        return "AccountBalanceResponse{" +
                "referenceNumber='" + referenceNumber + '\'' +
                ", totalBalance='" + totalBalance + '\'' +
                ", availableBalance='" + availableBalance + '\'' +
                ", currency='" + currency + '\'' +
                ", balanceDateTimeUTC=" + balanceDateTimeUTC +
                ", responseCode=" + responseCode +
                ", message='" + message + '\'' +
                '}';
    }
}
