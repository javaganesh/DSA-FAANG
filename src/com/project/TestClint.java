package com.project;

import java.util.List;
import java.util.Optional;

public class TestClint {
    public static void main(String[] args) {
        BooKInteface bookService=new BookService();
        bookService.addBook(new Book(101,"Java"));
        bookService.addBook(new Book(102,"Let us C"));
        bookService.addBook(new Book(103,"C++"));
        bookService.addBook(new Book(104,"Spring boot"));
        bookService.addBook(new Book(105,"HiberNate"));
        System.out.println(bookService);
        System.out.println(bookService.isBookAvailable("let us c"));
        Optional<Book> optinal = bookService.searchBook("MicroService");
       optinal.ifPresentOrElse((book -> {
           System.out.println(book);
       }),()->{
           System.out.println("book not Avaialble");
       });

       bookService.deletBook("C++");
    }
}
