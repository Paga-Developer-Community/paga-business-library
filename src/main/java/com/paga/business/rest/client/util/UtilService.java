package com.paga.business.rest.client.util;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class UtilService {

    private static String hashSHA512(String message) throws NoSuchAlgorithmException {

        MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
        messageDigest.update(message.getBytes(Charset.forName("UTF-8")));
        byte[] echoData = messageDigest.digest();
        String out;
        StringBuilder sb = new StringBuilder();
        for (byte element : echoData) {
            sb.append(Integer.toString((element & 0xff) + 0x100, 16).substring(1));
        }
        out = sb.toString();
        return out;
    }

    public String hashComputeHash(StringBuilder sBuilder) {

        try {
            return hashSHA512(sBuilder.toString());
        } catch (NoSuchAlgorithmException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}
