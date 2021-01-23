package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarehouseTestSuite {

    @Test
    public void testIsOrderInUse() throws OrderDoesntExistException {
        // given
        String orderNumber = "251465";
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(orderNumber);
        warehouse.addOrder("abc");
        // when
        Order result = warehouse.getOrder(orderNumber);

        // then
        assertEquals(new Order(orderNumber), result);
    }

    @Test (expected = OrderDoesntExistException.class)
    public void testIsOrderInUse_withException() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder("123");
        // when
        warehouse.getOrder("A128991");
    }
}
