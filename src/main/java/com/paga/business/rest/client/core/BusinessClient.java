package com.paga.business.rest.client.core;

import com.google.gson.Gson;
import com.paga.business.rest.client.constant.Definitions;
import com.paga.business.rest.client.request.*;
import com.paga.business.rest.client.response.*;
import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class BusinessClient {

    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private static final String REFERENCE_NUMBER = "referenceNumber";

    private ApiConnection apiConnection;


    private String principal;
    private String apiKey;
    private String credential;
    private boolean test;

    public BusinessClient(String principal, String apiKey, String credential, boolean test) {
        this.principal = principal;
        this.apiKey = apiKey;
        this.credential = credential;
        this.test = test;
    }


    /**
     * An operation for business to create Persistent Payment Account Numbers that can be assigned to their customers
     * for payment collection.
     * @param registerPersistentPaymentAccountRequest
     * @return RegisterPersistentPaymentAccountResponse
     *
     */
    public RegisterPersistentPaymentAccountResponse registerPersistentPaymentAccount(RegisterPersistentPaymentAccountRequest
                                                                                             registerPersistentPaymentAccountRequest){
        Gson gson = new Gson();
        JSONObject requestParams = new JSONObject();

        try {
            requestParams.put(REFERENCE_NUMBER, registerPersistentPaymentAccountRequest.getReferenceNumber());
            requestParams.put("phoneNumber", registerPersistentPaymentAccountRequest.getPhoneNumber());
            requestParams.put("firstName", registerPersistentPaymentAccountRequest.getFirstName());
            requestParams.put("lastName", registerPersistentPaymentAccountRequest.getLastName());
            requestParams.put("accountName", registerPersistentPaymentAccountRequest.getAccountName());
            requestParams.put("financialIdentificationNumber", registerPersistentPaymentAccountRequest.getFinancialIdentificationNumber());
            requestParams.put("accountReference", registerPersistentPaymentAccountRequest.getAccountReference());
            requestParams.put("email", registerPersistentPaymentAccountRequest.getEmail());

            System.out.println("Persistent Account request object :: " + requestParams);
        }catch (JSONException jsonException){
            jsonException.printStackTrace();
        }

        StringBuilder hashParams = new StringBuilder();
        hashParams.append(registerPersistentPaymentAccountRequest.getReferenceNumber());
        hashParams.append(registerPersistentPaymentAccountRequest.getPhoneNumber());
        hashParams.append(this.apiKey);

        RequestBody requestBody = RequestBody.create(JSON, requestParams.toString());
        JSONObject response = getApiResponse(requestBody, hashParams,
                Definitions.getBaseUrl(this.test) + Definitions.REGISTER_PERSISTENT_PAYMENT_ACCOUNT);

        System.out.println("response :: " + response);
        return gson.fromJson(String.valueOf(response), RegisterPersistentPaymentAccountResponse.class);
    }


    /**
     * An operation that can be used by Organizations to check the status of payments made to a Persistent Payment Account.
     * @param persistentPaymentAccountActivityRequest
     * @return PersistentPaymentAccountActivityResponse
     */
    public PersistentPaymentAccountActivityResponse getPersistentPaymentAccountActivity(PersistentPaymentAccountActivityRequest
                                                                                        persistentPaymentAccountActivityRequest){
        Gson gson = new Gson();
        JSONObject requestParams = new JSONObject();

        try {
            requestParams.put(REFERENCE_NUMBER, persistentPaymentAccountActivityRequest.getReferenceNumber());
            requestParams.put("accountNumber", persistentPaymentAccountActivityRequest.getAccountNumber());
            requestParams.put("getLatestSingleActivity", persistentPaymentAccountActivityRequest.getGetLatestSingleActivity());
            requestParams.put("accountReference", persistentPaymentAccountActivityRequest.getAccountReference());
            requestParams.put("startDate", persistentPaymentAccountActivityRequest.getStartDate());
            requestParams.put("endDate", persistentPaymentAccountActivityRequest.getEndDate());

            System.out.println("Persistent Account Activity request object :: " + requestParams);
        }catch (JSONException jsonException){
            jsonException.printStackTrace();
        }

        StringBuilder hashParams = new StringBuilder();
        hashParams.append(persistentPaymentAccountActivityRequest.getReferenceNumber());
        hashParams.append(this.apiKey);

        RequestBody requestBody = RequestBody.create(JSON, requestParams.toString());
        JSONObject response = getApiResponse(requestBody, hashParams,
                Definitions.getBaseUrl(this.test) + Definitions.GET_PERSISTENT_PAYMENT_ACCOUNT_ACTIVITY);

        System.out.println("Response :: " + response);
        return gson.fromJson(String.valueOf(response), PersistentPaymentAccountActivityResponse.class);
    }


    /**
     *
     * @param registerCustomerRequest
     * @return
     */

    public RegisterCustomerResponse registerCustomer(RegisterCustomerRequest registerCustomerRequest){
        Gson gson = new Gson();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dob = df.format(registerCustomerRequest.getCustomerDateOfBirth());


        JSONObject obj = new JSONObject();
        try {
            obj.put(REFERENCE_NUMBER, registerCustomerRequest.getReferenceNumber());
            obj.put("customerPhoneNumber",registerCustomerRequest.getCustomerPhoneNumber());
            obj.put("customerEmail",registerCustomerRequest.getCustomerEmail());
            obj.put("customerFirstName", registerCustomerRequest.getCustomerFirstName());
            obj.put("customerLastName", registerCustomerRequest.getCustomerLastName());
            obj.put("customerDateOfBirth", dob);

            System.out.println("customer request object :: " + obj);
        }catch (JSONException e1){
            e1.printStackTrace();
        }

        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(registerCustomerRequest.getReferenceNumber());
        sBuilder.append(registerCustomerRequest.getCustomerPhoneNumber());
        sBuilder.append(registerCustomerRequest.getCustomerFirstName());
        sBuilder.append(registerCustomerRequest.getCustomerLastName());
        sBuilder.append(this.apiKey);

        RequestBody body = RequestBody.create(JSON, obj.toString());
        JSONObject response = getApiResponse(body, sBuilder,
                Definitions.getBaseUrl(this.test) + Definitions.REGISTER_CUSTOMER);

        System.out.println("response register customer:: " + response);
        return gson.fromJson(String.valueOf(response), RegisterCustomerResponse.class);
    }

    /**
     *
     * @param registerCustomerRequest
     * @return
     */
    public RegisterCustomerResponse registerCustomerWithKYC(RegisterCustomerRequest registerCustomerRequest) {

        Gson gson = new Gson();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dob = df.format(registerCustomerRequest.getCustomerDateOfBirth());

        JSONObject obj = new JSONObject();
        JSONObject customerAddress = new JSONObject();

        try {
            customerAddress.put("country", registerCustomerRequest.getCustomerAddress().getCountry());
            customerAddress.put("region", registerCustomerRequest.getCustomerAddress().getRegion());
            customerAddress.put("local", registerCustomerRequest.getCustomerAddress().getLandmark());
            customerAddress.put("landmark", registerCustomerRequest.getCustomerAddress().getLandmark());
            customerAddress.put("freeformAddress", registerCustomerRequest.getCustomerAddress().getFreeformAddress());
            customerAddress.put("streetAddress", registerCustomerRequest.getCustomerAddress().getStreetAddress());

            obj.put("customerPhoneNumber", registerCustomerRequest.getCustomerPhoneNumber());
            obj.put("customerEmail", registerCustomerRequest.getCustomerEmail());
            obj.put(REFERENCE_NUMBER, registerCustomerRequest.getReferenceNumber());
            obj.put("customerFirstName", registerCustomerRequest.getCustomerFirstName());
            obj.put("customerLastName", registerCustomerRequest.getCustomerLastName());
            obj.put("customerDateOfBirth", dob);
            obj.put("customerMaritalStatus", registerCustomerRequest.getCustomerMaritalStatus());
            obj.put("customerPreferredLanguageISOCode", registerCustomerRequest.getCustomerPreferredLanguageISOCode());
            obj.put("customerReferredByFirstName", registerCustomerRequest.getCustomerReferredByFirstName());
            obj.put("customerReferredByLastName", registerCustomerRequest.getCustomerReferredByLastName());
            obj.put("customerReferredByPhoneNumber", registerCustomerRequest.getCustomerReferredByPhoneNumber());
            obj.put("customerGender", registerCustomerRequest.getCustomerGender());
            obj.put("customerIdType", registerCustomerRequest.getCustomerIdType());
            obj.put("customerIdNumber", registerCustomerRequest.getCustomerIdNumber());
            obj.put("customerIdExpirationDate", registerCustomerRequest.getCustomerIdExpirationDate());
            obj.put("optinForWalletSavings", registerCustomerRequest.getOptinForWalletSavings());
            obj.put("customerAddress", customerAddress);

            System.out.println("customer request object :: " + obj);

        } catch (JSONException e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace();
        }

        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(registerCustomerRequest.getReferenceNumber());
        sBuilder.append(registerCustomerRequest.getCustomerPhoneNumber());
        sBuilder.append(registerCustomerRequest.getCustomerFirstName());
        sBuilder.append(registerCustomerRequest.getCustomerLastName());
        sBuilder.append(this.apiKey);

        RequestBody requestBody = new MultipartBody.Builder().setType(MultipartBody.FORM).
                addFormDataPart("customer", "customer", RequestBody.create(JSON, obj.toString())).build();

        JSONObject response = getApiResponse(requestBody, sBuilder,
                Definitions.getBaseUrl(this.test) + Definitions.REGISTER_CUSTOMER_WITH_KYC);
        System.out.println("response register customer:: " + response);
        return gson.fromJson(String.valueOf(response), RegisterCustomerResponse.class);
    }

    /**
     * @param registerCustomerRequest
     * @return
     */
    public RegisterCustomerResponse registerCustomerAccountPhoto(RegisterCustomerRequest registerCustomerRequest) {
        JSONObject obj = new JSONObject();
        Gson gson = new Gson();

        try {
            obj.put("customerPhoneNumber", registerCustomerRequest.getCustomerPhoneNumber());
            obj.put(REFERENCE_NUMBER, registerCustomerRequest.getReferenceNumber());

        } catch (JSONException e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace();
        }

        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(registerCustomerRequest.getReferenceNumber());
        sBuilder.append(registerCustomerRequest.getCustomerPhoneNumber());
        sBuilder.append(this.apiKey);

        System.out.println("customer account photo ::" + registerCustomerRequest.getCustomerAccountPhoto().length());


        RequestBody requestBody = new MultipartBody.Builder().setType(MultipartBody.FORM).
                addFormDataPart("customer", "customer", RequestBody.create(JSON, obj.toString()))
                .addFormDataPart("customerAccountPhoto", "customerAccountPhoto",
                        RequestBody.create(MediaType.parse("image/jpeg"),
                                registerCustomerRequest.getCustomerAccountPhoto().getAbsoluteFile())).build();

        JSONObject response = getApiResponse(requestBody, sBuilder,
                Definitions.getBaseUrl(this.test) + Definitions.REGISTER_CUSTOMER_ACCOUNT_PHOTO);

        return gson.fromJson(String.valueOf(response), RegisterCustomerResponse.class);
    }

    /**
     * @param registerCustomerRequest
     * @return
     */
    public RegisterCustomerResponse registerCustomerIdentification(RegisterCustomerRequest registerCustomerRequest) {

        Gson gson = new Gson();

        JSONObject obj = new JSONObject();

        System.out.println("photo :: " + registerCustomerRequest.getCustomerIdentification().length());


        try {
            obj.put("customerPhoneNumber", registerCustomerRequest.getCustomerPhoneNumber());
            obj.put("customerIdType", registerCustomerRequest.getCustomerIdType());
            obj.put("customerIdNumber", registerCustomerRequest.getCustomerIdNumber());
            obj.put("customerIdExpirationDate", registerCustomerRequest.getCustomerIdExpirationDate());
            obj.put(REFERENCE_NUMBER, registerCustomerRequest.getReferenceNumber());

        } catch (JSONException e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace();
        }

        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(registerCustomerRequest.getReferenceNumber());
        sBuilder.append(registerCustomerRequest.getCustomerPhoneNumber());
        sBuilder.append(registerCustomerRequest.getCustomerIdType());
        sBuilder.append(registerCustomerRequest.getCustomerIdNumber());
        sBuilder.append(registerCustomerRequest.getCustomerIdExpirationDate());
        sBuilder.append(this.apiKey);

        RequestBody requestBody = new MultipartBody.Builder().setType(MultipartBody.FORM).
                addFormDataPart("customer", "customer", RequestBody.create(JSON, obj.toString()))
                .addFormDataPart("customerIdPhoto", "customerIdPhoto",
                        RequestBody.create(MediaType.parse("image/jpeg"),
                                registerCustomerRequest.getCustomerIdentification().getAbsoluteFile())).build();

        JSONObject response = getApiResponse(requestBody, sBuilder,
                Definitions.getBaseUrl(this.test) + Definitions.REGISTER_CUSTOMER_IDENTIFICATION);

        return gson.fromJson(String.valueOf(response), RegisterCustomerResponse.class);
    }

    /**
     * The KYC restricted Money Transfer status operation enables an integrated 3rd party to utilize the
     * Paga platform to check the status of the funds transferred using reference number, can be:
     * -  Successful - Recipient has received the funds (meets KYC requirement or upgrades)
     * -  Failed (Cancelled transaction - i.e. period for upgrade/pick up at an agent* has expired and
     * funds have been returned to WR's virtual account)
     * -  Pending (On hold) - Funds have been placed on hold pending a KYC upgrade or agent
     * pickup*)
     *
     * @param getKYCRestrictedMoneyTransferRequest
     * @return JSONObject
     */
    public GetKYCRestrictedMoneyTransferResponse getKYCRestrictedMoneyTransferStatus(GetKYCRestrictedMoneyTransferRequest
                                                                                             getKYCRestrictedMoneyTransferRequest)  {
        Gson gson = new Gson();
        JSONObject obj = new JSONObject();

        try {
            obj.put(REFERENCE_NUMBER, getKYCRestrictedMoneyTransferRequest.getReferenceNumber());
        } catch (JSONException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(getKYCRestrictedMoneyTransferRequest.getReferenceNumber());
        sBuilder.append(this.apiKey);

        RequestBody body = RequestBody.create(JSON, obj.toString());

        JSONObject response = getApiResponse(body, sBuilder, "secured/getKYCRestrictedMoneyTransferStatus");

        return gson.fromJson(String.valueOf(response), GetKYCRestrictedMoneyTransferResponse.class);

    }

    /**
     * The Money Transfer operation enables an integrated 3rd party to utilize the
     * Paga platform to transfer funds from a variety of sources to another party. The funds transfer
     * may be executed from the accounts of the integrated 3rd party themselves, or on behalf of
     * another customer with the appropriate authentication. The source of funds may be the sender's
     * Paga account or another source that the sender has pre-registered on the Paga platform.
     *
     * @param moneyTransferRequest
     * @return MoneyTransferResponse
     */
    public MoneyTransferResponse moneyTransfer(MoneyTransferRequest moneyTransferRequest) {

        JSONObject obj = new JSONObject();
        Gson gson = new Gson();

        try {
            obj.put(REFERENCE_NUMBER, moneyTransferRequest.getReferenceNumber());
            obj.put("amount", String.valueOf(moneyTransferRequest.getAmount()));
            obj.put("currency", moneyTransferRequest.getCurrency());
            obj.put("destinationAccount", moneyTransferRequest.getDestinationAccount());
            obj.put("destinationBank", moneyTransferRequest.getDestinationBank());
            obj.put("senderPrincipal", moneyTransferRequest.getSenderPrincipal());
            obj.put("senderCredentials", moneyTransferRequest.getSenderCredentials());
            obj.put("transferReference", moneyTransferRequest.getTransferReference());
            obj.put("sourceOfFunds", moneyTransferRequest.getSourceOfFunds());
            obj.put("sendWithdrawalCode", moneyTransferRequest.getSendWithdrawalCode());
            obj.put("suppressRecipientMessage", moneyTransferRequest.getSuppressRecipientMessage());
            obj.put("minRecipientKYCLevel", moneyTransferRequest.getMinRecipientKYCLevel());
            obj.put("holdingPeriod", moneyTransferRequest.getHoldingPeriod());
        } catch (JSONException e1) {
            e1.printStackTrace();
        }

        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(moneyTransferRequest.getReferenceNumber());
        sBuilder.append(moneyTransferRequest.getAmount());
        sBuilder.append(moneyTransferRequest.getDestinationAccount());
        sBuilder.append(this.apiKey);

        RequestBody body = RequestBody.create(JSON, obj.toString());

        JSONObject response = getApiResponse(body, sBuilder,
                Definitions.getBaseUrl(this.test) + Definitions.MONEY_TRANSFER);
        return gson.fromJson(String.valueOf(response), MoneyTransferResponse.class);
    }

    /**
     * The Bulk Money Transfer operation enables an integrated 3rd party to utilize the Paga
     * platform to execute the money transfer operation described  above to multiple recipients
     * simultaneously. This is limited to 300 payment items per bulk operation.
     *
     * @param moneyTransferBulkRequest
     * @return MoneyTransferBulkResponse
     */
    public MoneyTransferBulkResponse moneyTransferBulk(MoneyTransferBulkRequest moneyTransferBulkRequest) {

        Gson gson = new Gson();
        JSONObject obj = new JSONObject();

        JSONArray arr = new JSONArray();

        for (int i = 0; i < moneyTransferBulkRequest.getMoneyTransferItems().size(); i++) {
            JSONObject j;
            try {
                j = new JSONObject(moneyTransferBulkRequest.getMoneyTransferItems().get(i).toJson());
                arr.put(j);
            } catch (JSONException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return null;
            }

        }

        try {
            obj.put("items", arr);
            obj.put("bulkReferenceNumber", moneyTransferBulkRequest.getBulkReferenceNumber());

        } catch (JSONException e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace();
        }
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(moneyTransferBulkRequest.getMoneyTransferItems().get(0).getReferenceNumber());
        sBuilder.append(moneyTransferBulkRequest.getMoneyTransferItems().get(0).getAmount());
        sBuilder.append(moneyTransferBulkRequest.getMoneyTransferItems().get(0).getDestinationAccount());
        sBuilder.append(moneyTransferBulkRequest.getMoneyTransferItems().size());
        sBuilder.append(this.apiKey);

        RequestBody body = RequestBody.create(JSON, obj.toString());
        JSONObject response = getApiResponse(body, sBuilder,
                Definitions.getBaseUrl(this.test) + Definitions.MONEY_TRANSFER_BULK);

        return gson.fromJson(String.valueOf(response), MoneyTransferBulkResponse.class);
    }

    /**
     * The Get Mobile Operators operation enables an integrated 3rd party to
     * utilize the Paga platform to obtain a list of available mobile operators on the Paga platform,
     * typically for use in parameterizing the various operations of the business api
     *
     * @param getMobileOperatorsRequest
     * @return GetMobileOperatorsResponse
     */
    public GetMobileOperatorsResponse getMobileOperators(GetMobileOperatorsRequest getMobileOperatorsRequest) {

        Gson gson = new Gson();

        JSONObject obj = new JSONObject();

        try {
            obj.put(REFERENCE_NUMBER, getMobileOperatorsRequest.getReferenceNumber());
            obj.put("locale", getMobileOperatorsRequest.getLocale());

        } catch (JSONException e1) {
            e1.printStackTrace();
        }

        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(getMobileOperatorsRequest.getReferenceNumber()); // referenceNumber param value
        sBuilder.append(this.apiKey); // business organization api-key

        RequestBody body = RequestBody.create(JSON, obj.toString());
        JSONObject response = getApiResponse(body, sBuilder,
                Definitions.getBaseUrl(this.test) + Definitions.GET_MOBILE_OPERATORS);

        return gson.fromJson(String.valueOf(response), GetMobileOperatorsResponse.class);
    }

    /**
     * The Merchant Payment operation enables an integrated 3rd party to
     * utilize the Paga platform to make payments to registered merchants. The purchase can be
     * funded by the integrated 3rd party themselves, or on behalf of another customer with the
     * appropriate authentication. The source of funds may be the purchaser's Paga account or another
     * source that the sender has pre-registered on the Paga platform.
     *
     * @param merchantPaymentRequest
     * @return MerchantPaymentResponse
     */
    public MerchantPaymentResponse merchantPayment(MerchantPaymentRequest merchantPaymentRequest) {

        Gson gson = new Gson();

        System.out.println(gson.toJson(merchantPaymentRequest));

        JSONObject obj = new JSONObject();

        try {
            obj.put(REFERENCE_NUMBER, merchantPaymentRequest.getReferenceNumber());
            obj.put("amount", String.valueOf(merchantPaymentRequest.getAmount()));
            obj.put("currency", merchantPaymentRequest.getCurrency());
            obj.put("merchantAccount", merchantPaymentRequest.getMerchantAccount());
            obj.put("merchantReferenceNumber", merchantPaymentRequest.getMerchantReferenceNumber());
            obj.put("merchantService", merchantPaymentRequest.getMerchantService());
            obj.put("purchaserPrincipal", merchantPaymentRequest.getPurchaserPrincipal());
            obj.put("purchaserCredentials", merchantPaymentRequest.getPurchaserCredentials());
            obj.put("sourceOfFunds", merchantPaymentRequest.getPurchaserCredentials());
            obj.put("locale", merchantPaymentRequest.getLocale());

        } catch (JSONException e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace();
        }

        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(merchantPaymentRequest.getReferenceNumber());
        sBuilder.append(merchantPaymentRequest.getAmount());
        sBuilder.append(merchantPaymentRequest.getMerchantAccount());
        sBuilder.append(merchantPaymentRequest.getMerchantReferenceNumber());
        sBuilder.append(this.apiKey); // business organization api-key

        RequestBody body = RequestBody.create(JSON, obj.toString());
        JSONObject response = getApiResponse(body, sBuilder,
                Definitions.getBaseUrl(this.test) + Definitions.MERCHANT_PAYMENT);

        return gson.fromJson(String.valueOf(response), MerchantPaymentResponse.class);
    }

    /**
     * The Get Merchants operation enables an integrated 3rd party to utilize the
     * Paga platform to obtain a list of registered merchants on the Paga platform, typically for use in
     * parameterizing the merchant payment operation.
     *
     * @param getMerchantsRequest
     * @return GetMerchantResponse
     */
    public GetMerchantResponse getMerchants(GetMerchantsRequest getMerchantsRequest) {

        Gson gson = new Gson();
        JSONObject obj = new JSONObject();

        try {
            obj.put(REFERENCE_NUMBER, getMerchantsRequest.getReferenceNumber());
            obj.put("locale", getMerchantsRequest.getLocale());

        } catch (JSONException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(getMerchantsRequest.getReferenceNumber()); // referenceNumber param value
        sBuilder.append(this.apiKey); // business organization api-key

        RequestBody body = RequestBody.create(JSON, obj.toString());
        JSONObject response = getApiResponse(body, sBuilder,
                Definitions.getBaseUrl(this.test) + Definitions.GET_MERCHANTS);
        return gson.fromJson(String.valueOf(response), GetMerchantResponse.class);
    }

    /**
     * The Get Banks operation enables an integrated 3rd party to utilize the Paga
     * platform to obtain a list of available banks on the Paga platform, typically for use in
     * parameterize the deposit to bank operation.
     *
     * @param getBanksRequest
     * @return GetBanksResponse
     */
    public GetBanksResponse getBanks(GetBanksRequest getBanksRequest) {

        Gson gson = new Gson();
        JSONObject obj = new JSONObject();

        try {
            obj.put(REFERENCE_NUMBER, getBanksRequest.getReferenceNumber());
            obj.put("locale", getBanksRequest.getLocale());

        } catch (JSONException e1) {

            // TODO Auto-generated catch block
            //e1.printStackTrace();
        }

        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(getBanksRequest.getReferenceNumber()); // referenceNumber param value
        sBuilder.append(this.apiKey); // business organization api-key
        RequestBody body = RequestBody.create(JSON, obj.toString());
        JSONObject response = getApiResponse(body, sBuilder, Definitions.getBaseUrl(this.test) + Definitions.GET_BANKS);
        return gson.fromJson(String.valueOf(response), GetBanksResponse.class);
    }

    /**
     * The Get Merchants Services operation enables an integrated 3rd party
     * to utilize the Paga platform to obtain a list of registered services and service details for a given
     * registered merchant on the Paga platform, typically for use in parameterize the merchant
     * payment operation.
     *
     * @param getMerchantServicesRequest
     * @return GetMerchantServicesResponse
     */
    public GetMerchantServicesResponse getMerchantServices(GetMerchantServicesRequest getMerchantServicesRequest) {

        Gson gson = new Gson();
        JSONObject obj = new JSONObject();

        try {
            obj.put(REFERENCE_NUMBER, getMerchantServicesRequest.getReferenceNumber());
            obj.put("merchantPublicId", getMerchantServicesRequest.getMerchantPublicId());
            obj.put("locale", getMerchantServicesRequest.getLocale());

            System.out.println(obj);

        } catch (JSONException e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace();
        }

        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(getMerchantServicesRequest.getReferenceNumber()); // referenceNumber param value
        sBuilder.append(getMerchantServicesRequest.getMerchantPublicId()); // customer principal (phone number)
        sBuilder.append(this.apiKey); // business organization api-key

        RequestBody body = RequestBody.create(JSON, obj.toString());
        JSONObject response = getApiResponse(body, sBuilder,
                Definitions.getBaseUrl(this.test) + Definitions.GET_MERCHANT_SERVICES);
        return gson.fromJson(String.valueOf(response), GetMerchantServicesResponse.class);
    }

    /**
     * The Validate Deposit to Bank operation enables an integrated 3rd
     * party to utilize to pre-validate potential deposit to bank operations using the same parameters
     * that would be provided for the actual transaction. This will return a result indicating whether the
     * actual deposit to bank operation using the same parameters is likely to be successful or not, and
     * if not, why not. This will also validate the bank account number for the bank provided and
     * return the account holder name for that account as stored at the bank. This will also return any
     * fees that would be charged as part of the actual deposit to bank operation.
     *
     * @param validateDepositToBankRequest
     * @return ValidateDepositToBankResponse
     */
    public ValidateDepositToBankResponse validateDepositToBank(ValidateDepositToBankRequest validateDepositToBankRequest) {
        Gson gson = new Gson();
        JSONObject obj = new JSONObject();

        try {
            obj.put(REFERENCE_NUMBER, validateDepositToBankRequest.getReferenceNumber());
            obj.put("amount", String.valueOf(validateDepositToBankRequest.getAmount()));
            obj.put("currency", validateDepositToBankRequest.getCurrency());
            obj.put("destinationBankUUID", validateDepositToBankRequest.getDestinationBankUUID());
            obj.put("destinationBankAccountNumber", validateDepositToBankRequest.getDestinationBankAccountNumber());
            obj.put("recipientPhoneNumber", validateDepositToBankRequest.getRecipientPhoneNumber());
            obj.put("recipientMobileOperatorCode", validateDepositToBankRequest.getRecipientMobileOperatorCode());
            obj.put("recipientEmail", validateDepositToBankRequest.getRecipientEmail());
            obj.put("recipientName", validateDepositToBankRequest.getRecipientName());
            obj.put("locale", validateDepositToBankRequest.getLocale());
        } catch (JSONException e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace();
        }
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(validateDepositToBankRequest.getReferenceNumber()); // referenceNumber param value
        sBuilder.append(validateDepositToBankRequest.getAmount()); // customer principal (phone number)
        sBuilder.append(validateDepositToBankRequest.getDestinationBankUUID()); // customer password
        sBuilder.append(validateDepositToBankRequest.getDestinationBankAccountNumber());
        sBuilder.append(this.apiKey); // business organization api-key
        RequestBody body = RequestBody.create(JSON, obj.toString());
        JSONObject response = getApiResponse(body, sBuilder, Definitions.getBaseUrl(this.test) + Definitions.VALIDATE_DEPOSIT_BANK);
        return gson.fromJson(String.valueOf(response), ValidateDepositToBankResponse.class);
    }

    /**
     * The Deposit To Bank operation enables an integrated 3rd party to utilize the Paga platform to
     * deposit funds to any bank account. The funds will be deposited from the 3rd party�s businesses
     * Paga account to the bank and bank account specified in the operation parameters
     *
     * @param depositToBankRequest
     * @return DepositToBankResponse
     */
    public DepositToBankResponse depositToBank(DepositToBankRequest depositToBankRequest) {
        Gson gson = new Gson();

        JSONObject obj = new JSONObject();

        try {

            obj.put(REFERENCE_NUMBER, depositToBankRequest.getReferenceNumber());
            obj.put("amount", String.valueOf(depositToBankRequest.getAmount()));
            obj.put("currency", depositToBankRequest.getCurrency());
            obj.put("destinationBankUUID", depositToBankRequest.getDestinationBankUUID());
            obj.put("destinationBankAccountNumber", depositToBankRequest.getDestinationBankAccountNumber());
            obj.put("recipientPhoneNumber", depositToBankRequest.getRecipientPhoneNumber());
            obj.put("recipientMobileOperatorCode", depositToBankRequest.getRecipientMobileOperatorCode());
            obj.put("recipientEmail", depositToBankRequest.getRecipientEmail());
            obj.put("recipientName", depositToBankRequest.getRecipientName());
            obj.put("alternateSenderName", depositToBankRequest.getAlternateSenderName());
            obj.put("suppressRecipientMessage", String.valueOf(depositToBankRequest.getSuppressRecipientMessage()));
            obj.put("remarks", depositToBankRequest.getRemarks());
            obj.put("locale", depositToBankRequest.getLocale());

        } catch (JSONException e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace();
        }

        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(depositToBankRequest.getReferenceNumber()); // referenceNumber param value
        sBuilder.append(depositToBankRequest.getAmount()); // customer principal (phone number)
        sBuilder.append(depositToBankRequest.getDestinationBankUUID()); // customer password
        sBuilder.append(depositToBankRequest.getDestinationBankAccountNumber());
        sBuilder.append(this.apiKey); // business organization api-key

        RequestBody body = RequestBody.create(JSON, obj.toString());
        JSONObject response = getApiResponse(body, sBuilder,
                Definitions.getBaseUrl(this.test) + Definitions.DEPOSIT_TO_BANKS);
        return gson.fromJson(String.valueOf(response), DepositToBankResponse.class);
    }

    /**
     * The Account Balance operation enables an integrated 3rd party to utilize the
     * Paga platform to check the balance of a Paga account or any other account type pre-registered
     * on the Paga platform which support balance inquiries. The account balance check may be
     * executed for the account(s) of the integrated 3rd party themselves, or on behalf of another
     * customer with the appropriate authentication.
     *
     * @param accountBalanceRequest
     * @return AccountBalanceResponse
     */
    public AccountBalanceResponse accountBalance(AccountBalanceRequest accountBalanceRequest) {

        Gson gson = new Gson();
        JSONObject obj = new JSONObject();

        try {
            obj.put("referenceNumber", accountBalanceRequest.getReferenceNumber());
            obj.put("accountPrincipal", accountBalanceRequest.getAccountPrincipal());
            obj.put("accountCredentials", accountBalanceRequest.getAccountCredentials());
            obj.put("sourceOfFunds", accountBalanceRequest.getSourceOfFunds());
            obj.put("locale", accountBalanceRequest.getLocale());

        } catch (JSONException e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace();
        }

        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(accountBalanceRequest.getReferenceNumber()); // referenceNumber param value
        sBuilder.append(this.apiKey); // business organization api-key
        RequestBody body = RequestBody.create(JSON, obj.toString());
        JSONObject response = getApiResponse(body, sBuilder,
                Definitions.getBaseUrl(test) + Definitions.ACCOUNT_BALANCE);

        return gson.fromJson(String.valueOf(response), AccountBalanceResponse.class);
    }

    /**
     * The Transaction History operation enables an integrated 3rd party to utilize the Paga platform to
     * check the transaction history of their Paga account between selected date ranges. The account
     * balance check may be executed for the account(s) of the integrated 3rd party themselves, or on
     * behalf of another customer with the appropriate authentication. Transactions results are limited
     * to the most recent 10,000 results
     *
     * @param transactionHistoryRequest
     * @return TransactionHistoryResponse
     */
    public TransactionHistoryResponse transactionHistory(TransactionHistoryRequest transactionHistoryRequest) {

        Gson gson = new Gson();
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String startD = simpleDateFormat.format(transactionHistoryRequest.getStartDateUTC());
        String endD = simpleDateFormat.format(transactionHistoryRequest.getEndDateUTC());


        JSONObject obj = new JSONObject();

        try {
            obj.put("referenceNumber", transactionHistoryRequest.getReferenceNumber());
            obj.put("accountPrincipal", transactionHistoryRequest.getAccountPrincipal());
            obj.put("accountCredentials", transactionHistoryRequest.getAccountCredentials());
            obj.put("startDateUTC", startD);
            obj.put("endDateUTC", endD);
            obj.put("locale", transactionHistoryRequest.getLocale());

        } catch (JSONException e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace();
        }

        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(transactionHistoryRequest.getReferenceNumber()); // referenceNumber param value
        sBuilder.append(this.apiKey); // business organization api-key

        RequestBody body = RequestBody.create(JSON, obj.toString());
        JSONObject response = getApiResponse(body, sBuilder, Definitions.getBaseUrl(test) + Definitions.TRANSACTION_HISTORY);
        return gson.fromJson(String.valueOf(response), TransactionHistoryResponse.class);
    }

    /**
     * The Recent Transaction History operation enables an integrated
     * 3rd party to utilize the Paga platform to check the last 5 transactions on their Paga account. The
     * account balance check may be executed for the account(s) of the integrated 3rd party themselves
     * or on behalf of another customer with the appropriate authentication.
     *
     * @param recentTransactionHistoryRequest
     * @return JSONObject
     */
    public RecentTransactionHistoryResponse recentTransactionHistory(RecentTransactionHistoryRequest recentTransactionHistoryRequest) {

        Gson gson = new Gson();
        JSONObject obj = new JSONObject();

        try {

            obj.put(REFERENCE_NUMBER, recentTransactionHistoryRequest.getReferenceNumber());
            obj.put("accountPrincipal", recentTransactionHistoryRequest.getAccountPrincipal());
            obj.put("accountCredentials", recentTransactionHistoryRequest.getAccountCredentials());
            obj.put("locale", recentTransactionHistoryRequest.getLocale());

        } catch (JSONException e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace();
        }

        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(recentTransactionHistoryRequest.getReferenceNumber()); // referenceNumber param value
        sBuilder.append(this.apiKey); // business organization api-key

        RequestBody body = RequestBody.create(JSON, obj.toString());
        JSONObject response = getApiResponse(body, sBuilder,
                Definitions.getBaseUrl(test) + Definitions.RECENT_TRANSACTION_HISTORY);
        return gson.fromJson(String.valueOf(response), RecentTransactionHistoryResponse.class);
    }

    /**
     * The Get Operation Status operation allows an integrated 3rd party to
     * check on the status of a previous operation using the operation's reference number.
     *
     * @param getOperationStatusRequest
     * @return JSONObject
     */
    public GetOperationStatusResponse getOperationStatus(GetOperationStatusRequest getOperationStatusRequest) {
        Gson gson = new Gson();
        JSONObject obj = new JSONObject();

        try {
            obj.put("referenceNumber", getOperationStatusRequest.getReferenceNumber());
            obj.put("locale", getOperationStatusRequest.getLocale());

        } catch (JSONException e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace();
        }

        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(getOperationStatusRequest.getReferenceNumber()); // referenceNumber param value
        sBuilder.append(this.apiKey); // business organization api-key

        RequestBody body = RequestBody.create(JSON, obj.toString());
        JSONObject response = getApiResponse(body, sBuilder,
                Definitions.getBaseUrl(test) + Definitions.GET_OPERATION_STATUS);

        return gson.fromJson(String.valueOf(response), GetOperationStatusResponse.class);
    }

    /**
     * The Airtime Purchase operation enables an integrated 3rd party to utilize
     * the Paga platform to purchase airtime for any phone number on any of the major networks. The
     * purchase can be funded by the integrated 3rd party themselves, or on behalf of another customer
     * with the appropriate authentication. The source of funds may be the purchaser's Paga account or
     * another source that the sender has pre-registered on the Paga platform
     *
     * @param airtimePurchaseRequest
     * @return JSONObject
     */
    public AirtimePurchaseResponse airtimePurchase(AirtimePurchaseRequest airtimePurchaseRequest) {

        Gson gson = new Gson();

        JSONObject obj = new JSONObject();

        try {
            obj.put("referenceNumber", airtimePurchaseRequest.getReferenceNumber());
            obj.put("amount", String.valueOf(airtimePurchaseRequest.getAmount()));
            obj.put("currency", airtimePurchaseRequest.getCurrency());
            obj.put("destinationPhoneNumber", airtimePurchaseRequest.getDestinationPhoneNumber());
            obj.put("purchaserPrincipal", airtimePurchaseRequest.getPurchaserPrincipal());
            obj.put("purchaserCredentials", airtimePurchaseRequest.getPurchaserCredentials());
            obj.put("sourceOfFunds", airtimePurchaseRequest.getSourceOfFunds());
            obj.put("locale", airtimePurchaseRequest.getLocale());
            obj.put("isDataBundle", airtimePurchaseRequest.getIsDataBundle());
            obj.put("networkOperatorId", airtimePurchaseRequest.getNetworkOperatorId());

        } catch (JSONException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        StringBuilder sBuilder = new StringBuilder();

        sBuilder.append(airtimePurchaseRequest.getReferenceNumber());
        sBuilder.append(airtimePurchaseRequest.getAmount());
        sBuilder.append(airtimePurchaseRequest.getDestinationPhoneNumber());
        sBuilder.append(this.apiKey);

        RequestBody body = RequestBody.create(JSON, obj.toString());
        JSONObject response = getApiResponse(body, sBuilder,
                Definitions.getBaseUrl(test) + Definitions.AIRTIME_PURCHASE);
        return gson.fromJson(String.valueOf(response), AirtimePurchaseResponse.class);
    }

    /**
     * The  Onboard Merchant operation, allows Aggregator Organizations to create sub organizations
     * on the paga platform.
     *
     * @param onboardMerchantRequest
     * @return Onboarding response
     */
    public OnboardingResponse onboardMerchant(OnboardMerchantRequest onboardMerchantRequest) {
        Gson gson = new Gson();

        JSONObject obj = new JSONObject();
        JSONObject merchantInfo = new JSONObject();
        JSONObject legalEntity = new JSONObject();
        JSONObject legalEntityRepresentative = new JSONObject();
        JSONObject additionalParameters = new JSONObject();
        JSONObject integration = new JSONObject();


        String dob = null;
        String establishedDate = null;
        if (onboardMerchantRequest.getMerchantInfo().getLegalEntityRepresentative().getDateOfBirth() != null &&
                onboardMerchantRequest.getMerchantInfo().getAdditionalParameters().getEstablishedDate() != null) {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            dob = df.format(onboardMerchantRequest.getMerchantInfo().getLegalEntityRepresentative().getDateOfBirth());
            establishedDate = df.format(onboardMerchantRequest.getMerchantInfo().getAdditionalParameters().getEstablishedDate());
        }

        try {
            legalEntity.put("name", onboardMerchantRequest.getMerchantInfo().getLegalEntity().getName());
            legalEntity.put("description", onboardMerchantRequest.getMerchantInfo().getLegalEntity().getDescription());
            legalEntity.put("addressLine1", onboardMerchantRequest.getMerchantInfo().getLegalEntity().getAddressLine1());
            legalEntity.put("addressLine2", onboardMerchantRequest.getMerchantInfo().getLegalEntity().getAddressLine2());
            legalEntity.put("addressCity", onboardMerchantRequest.getMerchantInfo().getLegalEntity().getAddressState());
            legalEntity.put("addressState", onboardMerchantRequest.getMerchantInfo().getLegalEntity().getAddressState());
            legalEntity.put("addressZip", onboardMerchantRequest.getMerchantInfo().getLegalEntity().getAddressZip());
            legalEntity.put("addressCountry", onboardMerchantRequest.getMerchantInfo().getLegalEntity().getAddressCountry());

            legalEntityRepresentative.put("firstName", onboardMerchantRequest.getMerchantInfo().getLegalEntityRepresentative().getFirstName());
            legalEntityRepresentative.put("lastName", onboardMerchantRequest.getMerchantInfo().getLegalEntityRepresentative().getLastName());
            legalEntityRepresentative.put("dateOfBirth", dob);
            legalEntityRepresentative.put("phone", onboardMerchantRequest.getMerchantInfo().getLegalEntityRepresentative().getPhone());
            legalEntityRepresentative.put("email", onboardMerchantRequest.getMerchantInfo().getLegalEntityRepresentative().getEmail());

            additionalParameters.put("establishedDate", establishedDate);
            additionalParameters.put("websiteUrl", onboardMerchantRequest.getMerchantInfo().getAdditionalParameters().getWebsiteUrl());
            additionalParameters.put("displayName", onboardMerchantRequest.getMerchantInfo().getAdditionalParameters().getDisplayName());


            merchantInfo.put("legalEntity", legalEntity);
            merchantInfo.put("legalEntityRepresentative", legalEntityRepresentative);
            merchantInfo.put("additionalParameters", additionalParameters);

            integration.put("type", onboardMerchantRequest.getIntegration().getType());
            integration.put("financeAdminEmail", onboardMerchantRequest.getIntegration().getFinanceAdminEmail());


            obj.put("reference", onboardMerchantRequest.getReference());
            obj.put("merchantExternalId", onboardMerchantRequest.getMerchantExternalId());
            obj.put("merchantInfo", merchantInfo);
            obj.put("integration", integration);

            System.out.println(obj);

        } catch (JSONException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(onboardMerchantRequest.getReference());
        sBuilder.append(onboardMerchantRequest.getMerchantExternalId());
        sBuilder.append(onboardMerchantRequest.getMerchantInfo().getLegalEntity().getName());
        sBuilder.append(onboardMerchantRequest.getMerchantInfo().getLegalEntityRepresentative().getPhone());
        sBuilder.append(onboardMerchantRequest.getMerchantInfo().getLegalEntityRepresentative().getEmail());
        sBuilder.append(this.apiKey);

        RequestBody body = RequestBody.create(JSON, obj.toString());
        JSONObject response = getApiResponse(body, sBuilder, Definitions.getBaseUrl(test) + Definitions.ONBOARD_MERCHANTS);
        return gson.fromJson(String.valueOf(response), OnboardingResponse.class);
    }

    public ValidateCustomerResponse validateCustomer(String referenceNumber, String customerIdentifier) {
        Gson gson = new Gson();
        JSONObject obj = new JSONObject();
        try {
            obj.put("referenceNumber", referenceNumber);
            obj.put("customerIdentifier", customerIdentifier);

        } catch (JSONException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        StringBuilder sBuilder = new StringBuilder();

        sBuilder.append(referenceNumber);
        sBuilder.append(customerIdentifier);
        sBuilder.append(this.apiKey);
        RequestBody body = RequestBody.create(JSON, obj.toString());
        JSONObject response = getApiResponse(body, sBuilder, Definitions.getBaseUrl(test) + Definitions.VALIDATE_CUSTOMER);
        return gson.fromJson(String.valueOf(response), ValidateCustomerResponse.class);
    }


    public GetMerchantAccountDetailResponse getMerchantAccountDetails(GetMerchantAccountDetailRequest getMerchantAccountDetailRequest){
        Gson gson = new Gson();
        JSONObject obj = new JSONObject();
        try{
            obj.put(REFERENCE_NUMBER,getMerchantAccountDetailRequest.getReferenceNumber());
            obj.put("merchantAccount",getMerchantAccountDetailRequest.getMerchantAccount());
            obj.put("merchantReferenceNumber",getMerchantAccountDetailRequest.getMerchantReferenceNumber());
            obj.put("merchantServiceProductCode",getMerchantAccountDetailRequest.getMerchantServiceProductCode());

        }catch (JSONException e){
            e.printStackTrace();
        }

        StringBuilder sBuilder = new StringBuilder();

        sBuilder.append(REFERENCE_NUMBER);
        sBuilder.append(getMerchantAccountDetailRequest.getMerchantAccount());
        sBuilder.append(getMerchantAccountDetailRequest.getMerchantReferenceNumber());
        sBuilder.append(getMerchantAccountDetailRequest.getMerchantServiceProductCode());
        sBuilder.append(this.apiKey);
        RequestBody body = RequestBody.create(JSON, obj.toString());
        JSONObject response = getApiResponse(body, sBuilder,
                Definitions.getBaseUrl(test) + Definitions.GET_MERCHANT_ACCOUNT_DETAILS);

        return gson.fromJson(String.valueOf(response), GetMerchantAccountDetailResponse.class);
    }

    private JSONObject getApiResponse(RequestBody body, StringBuilder sBuilder, String requestPath) {
        this.apiConnection = new ApiConnection();
        return this.apiConnection.connectAndPost(body, sBuilder, requestPath, this.principal, this.credential);
    }

    public static class Builder {
        private String principal;
        private String apiKey;
        private Boolean test;
        private String credential;


        public Builder() {
        }

        public Builder setCredential(String credential) {
            this.credential = credential;
            return this;
        }

        public Builder setPrincipal(String principal) {
            this.principal = principal;
            return this;
        }

        public Builder setTest(Boolean test) {
            this.test = test;
            return this;
        }

        public Builder setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }


        public BusinessClient build() {
            return new BusinessClient(principal, apiKey, credential, test);
        }
    }


}


  

