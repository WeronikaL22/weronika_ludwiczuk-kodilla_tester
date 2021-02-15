package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
public class ShippingCenterTestSuite {

    @Test
    public void shouldReturnCorrectMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String message = bean.success("Czynszowa 3");
        Assertions.assertEquals("Package delivered to: Czynszowa 3", message);
        String message2 = bean.fail("Stalowa 0");
        Assertions.assertEquals("Package not delivered to: Stalowa 0", message2);
    }

    @Test
    public void shouldReturnFalseWhenPackageWeightsMoreThan30Kilos(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean message = bean.deliverPackage("Czynszowa", 55);
        Assertions.assertFalse(message);
    }

    @Test
    public void shouldSendPackageWhenDataIsCorrect (){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Czynszowa 3", 24);
        Assertions.assertEquals("Package delivered to: Czynszowa 3",message);
    }

    @Test
    public void shouldNotSendPackageWhenDataIncorrect(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Czynszowa 9", 2101);
        Assertions.assertEquals("Package not delivered to: Czynszowa 9",message);


    }


}