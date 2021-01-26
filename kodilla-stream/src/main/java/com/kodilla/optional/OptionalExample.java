package com.kodilla.optional;

import com.kodilla.stream.User;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = null;

        Optional<User> optionalUser = Optional.ofNullable(user);
        optionalUser.ifPresent(u -> System.out.println(u.getUsername()));

    }
}
