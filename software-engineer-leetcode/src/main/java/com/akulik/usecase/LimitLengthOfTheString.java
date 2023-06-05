package com.akulik.usecase;

public class LimitLengthOfTheString {

    public String limitation(final String originalString) {
        final String[] words = originalString.split("\\s");

        final StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (result.length() + word.length() > 10) {
                break;
            }
            result.append(word).append(" ");
        }

        return result.toString().strip();
    }

}
