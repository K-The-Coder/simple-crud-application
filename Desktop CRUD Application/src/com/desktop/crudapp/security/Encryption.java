/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desktop.crudapp.security;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Keketso Mabule
 */
public class Encryption
{
    /**
     * MD5 algorithm
     * @param input
     * @return
     */
    public static String MD5(String input)
    {
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashText = number.toString(16);
            while(hashText.length() > 32){
                hashText = "0" + hashText;
            }
            return hashText;
        }
        catch (NoSuchAlgorithmException ex){
            throw new RuntimeException(ex);
        }
    }
    
    /**
     * SHA1 hashing algorithm
     * @param input
     * @return
     */
    public static String SHA1(String input)
    {
        try{
            MessageDigest mDigest = MessageDigest.getInstance("SHA1");
            byte[] result = mDigest.digest(input.getBytes());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < result.length; i++){
                sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        }
        catch (NoSuchAlgorithmException ex){
            throw new RuntimeException(ex);
        }
    }
}
