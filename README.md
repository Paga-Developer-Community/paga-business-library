# paga-business-library
Paga has made it very easy for businesses to accept payments. Business Service Library is a Java module that helps you make API calls when processing Paga Business Transactions.

A Java API wrapper for the facilitation of quick and easy development and integration of Java based applications with the Paga Business Library.

Paga Business Library removes the difficult involved in consuming the Paga Business API and implements a diverse  helper methods to enable rapid integration and testing. 

## Links
-Project: https://github.com/pagadevcomm/paga-business-library


## Getting Started
Click on the link to get started https://mypaga.readme.io/docs/overview

### Dependencies:
- okhttp3 (installation procedures here: https://github.com/square/okhttp)

#### Maven 
 <dependency>
    <groupId>com.squareup.okhttp3</groupId>
    <artifactId>okhttp</artifactId>
    <version>3.4.1</version>
  </dependency>

#### Gradle
compile group: 'com.squareup.okhttp3', name: 'okhttp', version: '3.4.1'

-lombok(Installation Procedures here: https://github.com/mplushnikov/lombok-intellij-plugin

#### Maven
<dependency>
		<groupId>org.projectlombok</groupId>
		<artifactId>lombok</artifactId>
		<version>1.18.10</version>
		<scope>provided</scope>
</dependency>

#### Gradle
compile "org.projectlombok:lombok:1.18.10"

### Paga-Business-Library installation:
- Download BuisnessClient Library
- Add jar file as a Module to your Java project:
- On Intellij IDEA: File -> Project Structure -> Modules -> Dependencies Tab -> Add -> JARs or Directories -> Attach jar
- On Netbeans: Project properties -> Libraries -> Compile -> ADD JAR/folder -> Add Jar

## Examples
To Initialize Paga Business Client 
```java
import <packageName>.BusinessClient;
```
```java  
BusinessClient businessClient = new BusinessClient.Builder()
                .setPrincipal("<publicId>")
                .setApiKey("<apiKey>")
                .setCredential("<password>")
                .setTest(true)
                .build();
```                
  
To perform Money Transfer
```java
MoneyTransferResponse response = businessClient
                                .moneyTransfer(MoneyTransferRequest
                                .builder()
                                .alternateSenderName("")
                                .amount("amount")
                                .currency("currency")
                                .destinationAccount("destinationAccount")
                                .destinationBank("destinationBank")
                                .holdingPeriod("holding period")
                                .minRecipientKYCLevel("kycLevel")
                                .referenceNumber("referenceNumber")
                                .locale("locale")
                                .senderCredentials("senderCredentials")
                                .senderPrincipal("senderPrincipal")
                                .sourceOfFunds("PAGA")
                                .suppressRecipientMessage("suppressRecipientMessage")
                                .transferReference("transferReference")
                                .sendWithdrawalCode("sendWithdrawalCode")
                                .build());
```     

To Get Banks
```java
GetBanksResponse response = businessClient
                           .getBanks(GetBanksRequest
                           .builder()
                           .locale("locale")
                           .referenceNumber("referenceNumber")
                           .build());
```
