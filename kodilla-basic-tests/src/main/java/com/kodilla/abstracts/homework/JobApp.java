package com.kodilla.abstracts.homework;

public class JobApp {
    public static void main(String[] args) {

        Person adam = new Person("Adam", 34, new Mechanic());
        System.out.println("Adam's responsibilities are: "+adam.getJobResponsibilities());

        Person camilla = new Person("Camilla", 45, new Teacher());
        System.out.println("Camilla's responsibilities are: "+camilla.getJobResponsibilities());

        Person mark = new Person("Mark",28,new Painter());
        System.out.println("Mark's responsibilities are: "+mark.getJobResponsibilities());

    }
}
