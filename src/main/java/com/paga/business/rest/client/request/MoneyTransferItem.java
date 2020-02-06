package com.paga.business.rest.client.request;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MoneyTransferItem {

    private String referenceNumber;
    private String amount;
    private String currency;
    private String destinationAccount;
    private String destinationBank;
    private String senderPrincipal;
    private String senderCredentials;
    private String transferReference;
    private String sourceOfFunds;
    private boolean sendWithdrawalCode;
    private boolean suppressRecipientMessage;
    private String alternateSenderName;
    private String minRecipentKYCLevel;
    private int holdingPeriod;

    public String toJson()
    {

        Gson gson = new GsonBuilder().create();
        String json = gson.toJson(this);

        return json;

    }
}
