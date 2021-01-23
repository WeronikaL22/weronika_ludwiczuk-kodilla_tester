package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserValidatorTestSuite {
        private UserValidator userValidator = new UserValidator();

        @ParameterizedTest
        @NullAndEmptySource
        public void shouldReturnFalseIfUsernameIsNullOrEmpty(String username){
                assertFalse(userValidator.validateUsername(username));
        }

        @ParameterizedTest
        @ValueSource (strings = {"a" ,"al", "bu"})
        public void ShouldReturnFalseIfUsernameTooShort(String username){
                boolean result = (userValidator.validateUsername(username));
                assertFalse(result);
        }

        @ParameterizedTest
        @ValueSource (strings = {"Weronika@", "piotr%", "Kasia*","Kith Richards"})
        public void ShouldReturnFalseIfUsernameContainsSpecialCharactersOrSpaces(String username){
                boolean result = (userValidator.validateUsername(username));
                assertFalse(result);
        }
        @ParameterizedTest
        @ValueSource (strings = {"Weronika22", "piotr123", "Kasiaa7"})
        public void shouldReturnTrueWhenCombinationsWithLettersAndNumbersAreUsed(String username){
                boolean result = (userValidator.validateUsername(username));
                assertTrue(result);
        }
        @ParameterizedTest
        @ValueSource (strings = {"kasia!freyman@gmail.com","kon*rad@co.uk","milli kunis@onet.pl"})
        public void shouldReturnFalseIfEmailStringContainsSpecialCharactersOrSpaces(String email){
                boolean result =(userValidator.validateEmail(email));
                assertFalse(result);
        }
        @ParameterizedTest
        @NullAndEmptySource
        public void shouldReturnFalseIfEmailStringIsNullOrEmpty(String email){
                assertFalse(userValidator.validateEmail(email));
        }

}