package org.akulik.ocp.leetcode;

import java.util.Random;

public class UrlShorter1 {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int i1 = random.nextInt(52);
//            System.out.println("$$$ " + i1);
//            double randomValue = Math.random() * 20;
            result.append(alphabet.charAt(i1));
        }
        System.out.println("### " + result);
    }

    public String getRandomChars() {
        StringBuilder result = new StringBuilder();
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < 5; i++) {
            result.append(alphabet.charAt((int) Math.floor(Math.random() * alphabet.length())));
        }
        return result.toString();
    }

}
