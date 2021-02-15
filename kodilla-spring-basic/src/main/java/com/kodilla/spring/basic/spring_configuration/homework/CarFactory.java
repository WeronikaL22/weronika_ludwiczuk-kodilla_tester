package com.kodilla.spring.basic.spring_configuration.homework;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class CarFactory {

    @Bean
    public Car randomCar(){
        Car car;
        String[] strArr= {"Spring", "Autumn", "Summer","Winter"};
        Random generator = new Random();
        int chosen = generator.nextInt(strArr.length);
        if (chosen == 3) {
                car = new SUV();
            } else if (chosen == 2) {
                car = new Cabrio();
            } else {
                car = new Sedan();
            }
            return car;
    }

}

