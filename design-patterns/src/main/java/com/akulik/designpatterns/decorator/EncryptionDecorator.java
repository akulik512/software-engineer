package com.akulik.designpatterns.decorator;

import java.util.Base64;
import java.util.stream.IntStream;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    // Add responsibilities to objects, it's invisible to the code that uses them.
    @Override
    public String printMessage(String message) {
        return super.printMessage(encrypt(message));
    }

    private String encrypt(String message) {
        return Base64.getEncoder().encodeToString(convertToByte(message));
    }

    private byte[] convertToByte(String message) {
        final byte[] result = message.getBytes();
        IntStream.range(0, result.length).forEach(i -> result[i] += (byte) 1);
        return result;
    }

}
