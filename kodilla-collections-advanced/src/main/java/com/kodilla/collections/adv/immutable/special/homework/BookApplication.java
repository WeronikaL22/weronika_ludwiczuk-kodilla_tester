package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {

        Book book1 = BookManager.createBook("War and Peace", "Lev Tolstoy");
        Book book2 = BookManager.createBook("Pride and Prejudice","Jane Austin");
        Book serotonine = BookManager.createBook("Serotonine","Michel Houllebecq");

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(serotonine.hashCode());

        Book serotonineAgain = BookManager.createBook("Serotonine","Michel Houllebecq");

        System.out.println("----------------------------------");
        System.out.println("Addresses are the same: " + (serotonine == serotonineAgain));
        System.out.println("Values are the same: " + serotonine.equals(serotonineAgain));


    }
}
