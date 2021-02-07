package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {
    private ServiceMain serviceMain;
    private MessageServiceMain messageServiceMain;

    public ShippingCenter(ServiceMain serviceMain, MessageServiceMain messageServiceMain) {
        this.serviceMain = serviceMain;
        this.messageServiceMain = messageServiceMain;
    }

    public void sendPackage(String address, double weight) {
        if (serviceMain.deliverPackage(address, weight)) {
            messageServiceMain.success(address);
        } else {
            messageServiceMain.fail(address);
        }
    }
}
