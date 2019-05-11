package pl.coderslab.warsztat5krkw02.service;

import org.springframework.stereotype.Service;
import pl.coderslab.warsztat5krkw02.model.Book;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemoryBookService implements BookService {
    private List<Book> list;
    private long NEXT_ID = 1;

    public MemoryBookService() {
        list = new ArrayList<>();
        list.add(new Book(1L, "9788324631766", "Thinking in Java", "Bruce Eckel",
                "Helion", "programming"));
        list.add(new Book(2L, "9788324627738", "Rusz glowa, Java.",
                "Sierra Kathy, Bates Bert", "Helion", "programming"));
        list.add(new Book(3L, "9780130819338", "Java 2. Podstawy",
                "Cay Horstmann, Gary Cornell", "Helion", "programming"));
        this.NEXT_ID = 4L;
    }
    @Override
    public List<Book> getList() {return list;}
    @Override
    public void setList(List<Book> list) {this.list = list;}

    @Override
    public Book getBookById(long id) {
        for(Book b : this.list){
            if(b.getId() == id){
                return b;
            }
        }
        return null;
    }

    @Override
    public void addBook(Book book) {
        book.setId(this.NEXT_ID++);
        this.list.add(book);
    }

    @Override
    public void editBook(long id, Book book) {
        for(int i = 0; i<this.list.size(); i++){
            if(this.list.get(i).getId() == id){
                book.setId(id);
                this.list.set(i, book);
                return;
            }
        }
    }

    @Override
    public void deleteBookById(long id) {
        for(int i = 0; i<this.list.size(); i++){
            if(this.list.get(i).getId() == id){
                this.list.remove(i);
                return;
            }
        }
    }
}
