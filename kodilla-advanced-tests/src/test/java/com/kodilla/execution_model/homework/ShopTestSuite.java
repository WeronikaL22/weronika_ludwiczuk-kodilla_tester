package com.kodilla.execution_model.homework;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShopTestSuite {


    Shop shop = new Shop();

    Order order1 = new Order(12.30, LocalDate.of(2020, 12, 12), "marta123");
    Order order2 = new Order(67.89, LocalDate.of(2019, 1, 12), "Tomek_K");
    Order order3 = new Order(123.90, LocalDate.of(2020, 2, 2), "Sylwia");
    Order order4 = new Order(22.90, LocalDate.of(2020, 6, 20), "Sylwia");


    @Test
    public void shouldAddOrderToTheList() {
        // When
        shop.addOrder(new Order(23, LocalDate.now(), "zz"));
        // Then
        assertEquals(5, shop.getAllOrders().size());
    }


    @Test
    public void shouldReturnOrdersFilteredByDateRange() {
        // When
        Set<Order> result = shop.getOrdersByDateRange(
                LocalDate.of(2019, 1, 1),
                LocalDate.of(2021, 1, 1));
        // Then
        assertEquals(4, result.size());
    }

    @Test
    public void shouldReturnListOfOrdersByValueRange() {
        // When
        Set<Order> result = shop.getOrdersByValueRange((double)13, (double)70);
        // Then
        assertEquals(2, result.size());
        assertEquals(67.89, result.stream().findFirst().get().getValue());
    }

    @Test
    public void shouldReturnOrdersCount() {
        // When
        Integer result = shop.getOrdersCount();
        // Then
        assertEquals(4, result);
    }

    @Test
    public void shouldOrdersTotalValue() {
        // When
        Double result = shop.getOrdersTotalValue();
        // Then
        assertEquals(226.99, result);
    }

    @BeforeEach
    public void initializeShop () {
            shop.addOrder(order1);
            shop.addOrder(order2);
            shop.addOrder(order3);
            shop.addOrder(order4);

        }

}
