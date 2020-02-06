package com.paga.business.rest.client.response;

import java.util.ArrayList;
import java.util.List;

public class GetMobileOperatorsResponse {

    private String referenceNumber;
    private List<GetMobileOperatorsResponse.MobileOperator> mobileOperator = new ArrayList<GetMobileOperatorsResponse.MobileOperator>();

    public GetMobileOperatorsResponse() {
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public List<MobileOperator> getMobileOperator() {
        return mobileOperator;
    }

    public void setMobileOperator(List<MobileOperator> mobileOperator) {
        this.mobileOperator = mobileOperator;
    }

    public static class MobileOperator {

        private String name;
        private String mobileOperatorCode;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getMobileOperatorCode() {
            return mobileOperatorCode;
        }
        public void setMobileOperatorCode(String mobileOperatorCode) {
            this.mobileOperatorCode = mobileOperatorCode;
        }

        @Override
        public String toString() {
            return "MobileOperator{" +
                    "name='" + name + '\'' +
                    ", mobileOperatorCode='" + mobileOperatorCode + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "GetMobileOperatorsResponse{" +
                "referenceNumber='" + referenceNumber + '\'' +
                ", mobileOperator=" + mobileOperator +
                '}';
    }
}
