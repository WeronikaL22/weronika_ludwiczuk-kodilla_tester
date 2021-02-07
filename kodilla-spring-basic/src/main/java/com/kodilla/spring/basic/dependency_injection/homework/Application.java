package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {
    public static void main(String[] args) {
        ServiceMain serviceMain = new DeliveryService();
        MessageServiceMain messageServiceMain = new NotificationService();

        ShippingCenter shippingCenter = new ShippingCenter(serviceMain,messageServiceMain);
        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
    }
}
