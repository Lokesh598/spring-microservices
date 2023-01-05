package com.lokesh.feingcliendemo.controller;

import com.lokesh.feingcliendemo.entity.Book;
import com.lokesh.feingcliendemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping(value = "/{bookId}", produces="application/json")
    public Book getBookByBookId(@PathVariable String bookId) {
        return bookService.getBookByBookId(bookId);
    }
}
