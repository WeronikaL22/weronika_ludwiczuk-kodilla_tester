package com.kodilla.exception.homework;

public class WarehouseApp {

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder("12657893");
        warehouse.addOrder("12657893");
        warehouse.addOrder("1789010");
        warehouse.addOrder("572920");

        try {
            Order ord1 = warehouse.getOrder("12657893"); // ok
            System.out.println(ord1.getNumber());
            Order ord2 = warehouse.getOrder("bububu"); // throws
        } catch (OrderDoesntExistException existException) {
            System.out.println("Order with this number does not exist!");
        } finally {
            System.out.println("The end");
        }

    }
}
