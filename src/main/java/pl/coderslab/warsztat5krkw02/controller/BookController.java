package pl.coderslab.warsztat5krkw02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.warsztat5krkw02.model.Book;
import pl.coderslab.warsztat5krkw02.service.MemoryBookService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private MemoryBookService mbs;

    @Autowired
    public BookController(MemoryBookService mbs) {
        this.mbs = mbs;
    }

    @GetMapping("/hello")
    public String hello(){
        return "{hello: World}";
    }

    @GetMapping("/helloBook")
    public Book helloBook(){
        return new Book(1L,
                "9788324631766",
                "Thinking in Java",
                "Bruce Eckel",
                "Helion", "programming");
    }

    @GetMapping("")
    public List<Book> getAllBooks(){
        return this.mbs.getList();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable long id){
        return this.mbs.getBookById(id);
    }

    @PostMapping("")
    public String postBook(@RequestBody Book book){
        this.mbs.addBook(book);

        return "{status: ok}";
    }
}
