package com.akulik;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class UrlShorter {

    private static final String ALLOWED_STRING = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final char[] ALLOWED_CHARACTERS = ALLOWED_STRING.toCharArray();
    private static final int LENGTH = ALLOWED_CHARACTERS.length;

    public String encode(long input) {
        var encodedString = new StringBuilder();

        if (input == 0) {
            return String.valueOf(ALLOWED_CHARACTERS[0]);
        }

        while (input > 0) {
            encodedString.append(ALLOWED_CHARACTERS[(int) (input % LENGTH)]);
            input = input / LENGTH;
        }

        return encodedString.reverse().toString();
    }

    public long decode(String input) {
        var characters = input.toCharArray();
        var length = characters.length;

        var decoded = 0;

        //counter is used to avoid reversing input string
        var counter = 1;
        for (char character : characters) {
            decoded += ALLOWED_STRING.indexOf(character) * Math.pow(LENGTH, length - counter);
            counter++;
        }
        return decoded;
    }

    public static void main(String[] args) {
        Map<String, String> stringStringTreeMap = new HashMap<>();
        stringStringTreeMap.put("2", "2");
        stringStringTreeMap.put("4", "4");
        stringStringTreeMap.put("3", "3");
        stringStringTreeMap.put("1", "1");
        stringStringTreeMap.put("5", "5");
        System.out.println(stringStringTreeMap);
    }

}
