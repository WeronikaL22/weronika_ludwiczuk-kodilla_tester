package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class CarFactoryTestSuite {

    @Test
    public void shouldDrawRandomCar(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("randomCar");
        //wHEN
        String type = car.getCarType();
        System.out.println(type);
        //Then
        List<String> possibleCars = Arrays.asList("SUV","Sedan","Cabrio");
        Assertions.assertTrue(possibleCars.contains(type));
    }

    @Test
    public void shouldTurnTheLightsOnDependingOnHour(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("randomCar");
        //When
        boolean result = car.hasHeadlightsTurnedOn();
        System.out.println(result);
        //then
        Assertions.assertTrue(result);
    }
}