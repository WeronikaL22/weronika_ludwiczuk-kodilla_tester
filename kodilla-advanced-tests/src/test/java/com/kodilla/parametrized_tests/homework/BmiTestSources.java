package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BmiTestSources {

    static Stream<Arguments> provideDoublesForTestingOutcomeMessage(){
        return Stream.of(
                Arguments.of(1.0, 2.0, "Very severely underweight"),
                Arguments.of(70.0, 1.86, "Normal (healthy weight)"),
                Arguments.of(100.0, 1.50, "Obese Class III (Very severely obese)"),
                Arguments.of(200.0, 1.66, "Obese Class VI (Hyper Obese)"),
                Arguments.of(90.0, 1.6, "Obese Class II (Severely obese)")
        );
    }
}
