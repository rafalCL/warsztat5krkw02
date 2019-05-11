package pl.coderslab.warsztat5krkw02.service;

import pl.coderslab.warsztat5krkw02.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getList();

    void setList(List<Book> list);

    Book getBookById(long id);

    void addBook(Book book);

    void editBook(long id, Book book);

    void deleteBookById(long id);
}
