package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Warehouse {
    private List<Order> orderList = new ArrayList<>();

    public void addOrder(String number) {
        orderList.add(new Order(number));
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        Optional<Order> result = orderList
                .stream()
                .filter(order -> order.getNumber().equals(number))
                .findFirst();

        if(result.isEmpty()) {
            throw new OrderDoesntExistException();
        }

        return result.get();
    }
}
