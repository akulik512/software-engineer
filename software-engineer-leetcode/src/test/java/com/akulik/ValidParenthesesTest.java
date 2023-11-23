package com.akulik;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ValidParenthesesTest {

    ValidParentheses validParentheses = new ValidParentheses();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("()[]{}", true),
                Arguments.of("({[]})", true),
                Arguments.of("(]", false)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void isValid(String s, boolean expectedResult) {
        boolean valid = validParentheses.isValid(s);
        assertThat(valid).isEqualTo(expectedResult);
    }

}