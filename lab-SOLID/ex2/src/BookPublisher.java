// package com.solid.book;


import java.util.List;

public class BookPublisher {
    public static void main(String[] args) {
        Book book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        Printer printer = new Printer();
        printer.printToScreen(book);
    }
}
