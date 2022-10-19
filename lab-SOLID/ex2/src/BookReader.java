// package com.solid.book;


import java.util.List;

public class BookReader {
    public static void main(String[] args) {
        Book book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        Printer printer = new Printer();
        printer.printToFile(book);
    }
}
