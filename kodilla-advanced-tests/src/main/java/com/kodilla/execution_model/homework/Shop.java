package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

       private Set<Order> orders = new HashSet<>();

       public void addOrder (Order order) {
       this.orders.add(order);

   }

       public Set<Order> getOrdersByDateRange(LocalDate from, LocalDate to){
       return this.orders
               .stream()
               .filter(order -> order.getDate().isAfter(from) && order.getDate().isBefore(to))
               .collect(Collectors.toSet());
   }


      public Set<Order> getOrdersByValueRange(Double min, Double max){
       return this.orders
                 .stream()
                 .filter(order -> order.getValue() >= min && order.getValue() <= max)
                 .collect(Collectors.toSet());

       }

       public Set<Order> getAllOrders(){
           return this.orders;
    }

       public int getOrdersCount(){
        return this.orders.size();
    }

       public double getOrdersTotalValue(){
        return this.orders
                .stream()
                .mapToDouble(Order::getValue).sum();
    }

}


