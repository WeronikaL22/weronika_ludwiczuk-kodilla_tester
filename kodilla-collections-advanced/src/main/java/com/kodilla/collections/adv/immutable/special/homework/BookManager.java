package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashMap;
import java.util.Map;

public class BookManager {
    private static Map<String, Book> books = new HashMap<>();

    public static Book createBook(String title, String author) {
        String key = title + author;
        if(!books.containsKey(key)) {
            Book book = new Book(title, author);
            books.put(key, book);
        }
        return books.get(key);
    }
}
