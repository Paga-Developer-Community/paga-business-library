package com.paga.business.rest.client.constant;

/**
 * @author Iyanu Adelekan on 17/07/2016.
 */
public class Definitions {

    private static final String TEST_BASE_API_ENDPOINT = "https://beta.mypaga.com/paga-webservices/business-rest/"; //https://qa1.
    private static final String LIVE_BASE_API_ENDPOINT = "https://mypaga.com/paga-webservices/business-rest/";



    public static final String REGISTER_CUSTOMER = "secured/registerCustomer";
    public static final String REGISTER_CUSTOMER_ACCOUNT_PHOTO = "secured/registerCustomerAccountPhoto";
    public static final String REGISTER_CUSTOMER_IDENTIFICATION = "secured/registerCustomerIdentification";
    public static final String MONEY_TRANSFER = "secured/moneyTransfer";
    public static final String MONEY_TRANSFER_BULK = "secured/moneyTransferBulk";
    public static final String GET_MOBILE_OPERATORS = "secured/getMobileOperators";
    public static final String MERCHANT_PAYMENT = "secured/merchantPayment";
    public static final String GET_MERCHANTS = "secured/getMerchants";
    public static final String GET_BANKS = "secured/getBanks";
    public static final String GET_MERCHANT_SERVICES = "secured/getMerchantServices";
    public static final String VALIDATE_DEPOSIT_BANK = "secured/validateDepositToBank";
    public static final String DEPOSIT_TO_BANKS = "secured/depositToBank";
    public static final String ACCOUNT_BALANCE = "secured/accountBalance";
    public static final String TRANSACTION_HISTORY = "secured/transactionHistory";
    public static final String RECENT_TRANSACTION_HISTORY = "secured/recentTransactionHistory";
    public static final String GET_OPERATION_STATUS = "secured/getOperationStatus";
    public static final String AIRTIME_PURCHASE = "secured/airtimePurchase";
    public static final String ONBOARD_MERCHANTS = "secured/onboardMerchant";
    public static final String VALIDATE_CUSTOMER = "secured/validateCustomer";
    public static final String GET_MERCHANT_ACCOUNT_DETAILS = "secured/getMerchantAccountDetails";





    public static String getBaseUrl(boolean test){
       if(test){
           return TEST_BASE_API_ENDPOINT;
       }else{
           return LIVE_BASE_API_ENDPOINT;
       }
    }




}
