package com.kodilla.parametrized_tests.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

class GamblingMachineTestSuite {

    private GamblingMachine machine = new GamblingMachine();

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldThrowWhenNumbersEmpty(Set<Integer> numbers)  {
        Assertions.assertThrows(InvalidNumbersException.class, () -> {
        machine.howManyWins(numbers);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources ="/numbersOutOfRange.cvs", numLinesToSkip = 1)
    public void shouldThrowWhenNumbersOutOfRange(String numbers) {
        Set<Integer> inputNumbers = convertStringToIntegerSet(numbers);
        Assertions.assertThrows(InvalidNumbersException.class, () -> {
            machine.howManyWins(inputNumbers);
        });

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/notSixNumbersDrawn.csv", numLinesToSkip = 1)
    public void shouldThrowWhenNotSixNumbersAreDrawn(String numbers) {
        Set<Integer> inputNumbers = convertStringToIntegerSet(numbers);

        Assertions.assertThrows(InvalidNumbersException.class, () -> {
        machine.howManyWins(inputNumbers);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/correctNumbers.csv", numLinesToSkip = 1)
    public void shouldNotThrowWhenNumbersCorrect(String numbers) {
        Set<Integer> inputNumbers = convertStringToIntegerSet(numbers);

        Assertions.assertDoesNotThrow(() -> {
            machine.howManyWins(inputNumbers);
        });
    }

    // Helper method
    private Set<Integer> convertStringToIntegerSet(String numbers) {
        Set<Integer> inputNumbers = Arrays.stream(numbers.split(" "))
                .map(x -> Integer.parseInt(x))
                .collect(Collectors.toSet());
        return inputNumbers;
    }
}
