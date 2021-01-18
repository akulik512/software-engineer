package com.akulik.designpatterns.decorator.encrypt;

import java.util.Base64;
import java.util.stream.IntStream;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(final DataSource source) {
        super(source);
    }

    @Override
    public String printMessage(final String message) {
        return super.printMessage(encrypt(message));
    }

    private String encrypt(final String message) {
        return Base64.getEncoder().encodeToString(convertToByte(message));
    }

    private byte[] convertToByte(final String message) {
        final byte[] result = message.getBytes();
        IntStream.range(0, result.length).forEach(i -> result[i] += (byte) 1);
        return result;
    }

}
