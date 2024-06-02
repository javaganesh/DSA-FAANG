package com.project;

import java.util.Optional;

public interface BooKInteface {
    public int addBook(Book book);
    public boolean isBookAvailable(String bookName);
    public Optional<Book> searchBook(String bookName);
    public void deletBook(String bookName);


}
