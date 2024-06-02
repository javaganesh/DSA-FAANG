package com.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookService  implements BooKInteface{
    private List<Book> books = new ArrayList<>();

    public int addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null");
        }
        books.add(book);
        return book.getId();
    }

    public boolean isBookAvailable(String bookName) {
        for (Book book : books) {
            if (book.getBookName().equalsIgnoreCase(bookName.trim())) {
                return true;
            }
        }
        return false;
    }

    public Optional<Book> searchBook(String bookName) {
        for (Book book : books) {
            if (book.getBookName().equalsIgnoreCase(bookName.trim())) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public void deletBook(String bookName) {

         Optional<Book> optionalBook=searchBook(bookName);
         if(optionalBook.isPresent()){
             books.remove(optionalBook.get());
             System.out.println("book deleted SucessFully");
         }
         else {
             System.out.println("this booke is not Availble for delete");

         }




    }
}
