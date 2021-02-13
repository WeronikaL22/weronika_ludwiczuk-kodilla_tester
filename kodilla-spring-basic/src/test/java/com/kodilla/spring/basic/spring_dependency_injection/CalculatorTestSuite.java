package com.kodilla.spring.basic.spring_dependency_injection;

import com.kodilla.spring.basic.spring_dependency_injection.homework.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void shouldAddTwoIntroducedNumbers(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.add(23,15);
        Assertions.assertEquals(38.0, result);
    }
    @Test
    public void shouldSubtractTwoIntroducedNumbers(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.subtract(0,15);
        Assertions.assertEquals(-15, result);
    }
    @Test
    public void shouldMultiplyTwoIntroducedNumbers(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.multiply(5,5);
        Assertions.assertEquals(25, result);
    }
    @Test
    public void shouldDivideTwoIntroducedNumbers(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.divide(5,2);
        Assertions.assertEquals(2.5, result);
    }


}
