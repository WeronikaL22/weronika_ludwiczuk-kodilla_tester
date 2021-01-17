package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avg = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(ForumStats:: NumberOfPosts)
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("The average of posts of users aged 40 or more is: " + avg);

        double avg2 = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(ForumStats:: NumberOfPosts)
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("The average of posts of users aged less than 40: " + avg2);


    }
    public static int NumberOfPosts(User user){
        return user.getNumberOfPost();
    }
}
