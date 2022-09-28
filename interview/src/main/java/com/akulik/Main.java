package com.akulik;

import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        UrlShorter1 urlShorter1 = new UrlShorter1();
        UUID uuid = UUID.randomUUID();

        System.out.println("### " + urlShorter1.getRandomChars());
        System.out.println("### " + uuid);
    }

}