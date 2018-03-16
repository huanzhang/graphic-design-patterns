package org.hzhang.designpatterns.creational.simplefactory;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.util.Locale;

/**
 * Created by Zhang Huan on 13/03/2018.
 */
class Client {
    public static void main() throws NoSuchAlgorithmException, NoSuchPaddingException {
        Product product = Factory.createProduct("A");

        // java.text.DateFormat
        DateFormat df1 = DateFormat.getDateInstance();
        DateFormat df2 = DateFormat.getDateInstance(1);
        DateFormat df3 = DateFormat.getDateInstance(1, Locale.CHINA);

        // javax.crypto.KeyGenerator, javax.crypto.Cipher
        KeyGenerator keyGenerator = KeyGenerator.getInstance("DESede");
        Cipher cp = Cipher.getInstance("DESede");
    }
}
