package com.paga.business.rest.client.response;

import java.util.ArrayList;
import java.util.List;

public class GetBanksResponse {

    private String referenceNumber;
    private List<GetBanksResponse.Banks> banks = new ArrayList<GetBanksResponse.Banks>();
    private String message;
    private int responseCode;


    public GetBanksResponse() {
    }

    public GetBanksResponse(String referenceNumber, List<Banks> banks, String message, int responseCode) {
        this.referenceNumber = referenceNumber;
        this.banks = banks;
        this.message = message;
        this.responseCode = responseCode;

    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public List<Banks> getBanks() {
        return banks;
    }

    public void setBanks(List<Banks> banks) {
        this.banks = banks;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }



    @Override
    public String toString() {
        return "GetBanksResponse{" +
                "referenceNumber='" + referenceNumber + '\'' +
                ", banks=" + banks +
                ", message='" + message + '\'' +
                ", responseCode=" + responseCode +
                '}';
    }

    public static class Banks {

        private String name;
        private String uuid;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getUuid() {
            return uuid;
        }
        public void setUuid(String uuid) {
            this.uuid = uuid;
        }

        @Override
        public String toString() {
            return "Banks{" +
                    "name='" + name + '\'' +
                    ", uuid='" + uuid + '\'' +
                    '}';
        }
    }

}
