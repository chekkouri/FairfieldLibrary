package edu.miu.cs.cs425.fairfieldlibrarydbcliapp.service;

import edu.miu.cs.cs425.fairfieldlibrarydbcliapp.model.Book;

public interface BookService {

    public abstract Iterable<Book> getAllBooks();
    public abstract Book addNewBook(Book book);
    public abstract Book getBookById(Integer bookId);
    Book updateBookById(Integer bookId);
    Book getBookByISBN(String isbn);

}
