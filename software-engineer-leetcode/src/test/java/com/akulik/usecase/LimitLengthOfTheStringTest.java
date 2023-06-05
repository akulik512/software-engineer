package com.akulik.usecase;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LimitLengthOfTheStringTest {

    private final LimitLengthOfTheString limitLengthOfTheString = new LimitLengthOfTheString();

    @Test
    void does() {
        final String stringHas32Characters = "aaaaaaaaaa bbbbbbbbbb cccccccccc";

        final String result = limitLengthOfTheString.limitation(stringHas32Characters);

        assertThat(result).isEqualTo("aaaaaaaaaa").hasSize(10);
    }

}