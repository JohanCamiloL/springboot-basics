package io.johancamilo.springbootbasics;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    private ArrayList<Book> books = new ArrayList<>();

    @PostMapping("/book")
    public int addBook(@RequestBody Book book) {
        books.add(book);

        return book.getId();
    }

    @GetMapping
    public List<Book> getBooks() {
        return books;
    }

    @GetMapping("/book/{id}")
    public Book getBookById(@PathVariable int id) {
        for (Book book: books) {
            if (book.getId() == id) {
                return book;
            }
        }

        return null;
    }
}
