package com.pride.encry.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class JasyptEncryptUtil {

    public static final String P_KEY = "pride";//密钥，即私钥

    public static String decrypt(String pKey, String encryptedMessage) {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword(pKey);
        return textEncryptor.decrypt(encryptedMessage);
    }

    public static String decrypt(String myPassword) {
        return decrypt(P_KEY, myPassword);
    }

    public static String encrypt(String pKey, String myPassword) {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword(pKey);
        return textEncryptor.encrypt(myPassword);
    }

    public static String encrypt(String myPassword) {
        return encrypt(P_KEY, myPassword);
    }

    public static void main(String[] args) {
//        String myPassword = encrypt("zjhs_gz"); //给密码或用户名加密
        String myPassword = encrypt("root");
        System.out.println(myPassword);
//        System.out.println("解密后：" + decrypt(myPassword));
//        System.out.println(decrypt("C52RA6cgstFI4LkMRsfYJucUY1Rtz0dw"));
    }
}
