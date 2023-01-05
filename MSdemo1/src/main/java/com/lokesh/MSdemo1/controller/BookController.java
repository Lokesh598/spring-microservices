//package com.lokesh.MSdemo1.controller;
//
//import com.lokesh.MSdemo1.entity.Book;
//import com.lokesh.MSdemo1.service.BookService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import javax.annotation.Generated;
//import java.util.List;
//
//@RestController
//public class BookController {
//    @Autowired
//    BookService bookService;
//
//    @GetMapping(produces = "application/json")
//    public ResponseEntity<List<Book>> getAllBooks() {
//        return new ResponseEntity<List<Book>>(bookService.getAllBooks(), HttpStatus.OK);
//    }
//
//    @GetMapping(value = "/{bookId}",produces="application/json")
//    public ResponseEntity<Book> getBookById(@PathVariable String bookId) {
//        return new ResponseEntity<Book>(bookService.getBookById(bookId), HttpStatus.OK);
//    }
//
//    @PostMapping(consumes = "application/json")
//    public HttpStatus insertBook(@RequestBody Book book) {
//        if(bookService.insertOrModifyBook(book))
//            return HttpStatus.OK;
//        return HttpStatus.NOT_MODIFIED;
//    }
//
//    @PutMapping(consumes = "application/json")
//    public HttpStatus modifyBook(@RequestBody Book book) {
//        if(bookService.insertOrModifyBook(book))
//            return HttpStatus.OK;
//        return HttpStatus.NOT_MODIFIED;
//    }
//
//    @DeleteMapping ("/{bookId}")
//    public HttpStatus deleteBookById(@PathVariable String bookId) {
//        bookService.deleteBookById(bookId);
//        return HttpStatus.OK;
//    }
//    //handle the exception it will will return not found
//    @ExceptionHandler (RuntimeException.class)
//    public HttpStatus returnStatusNotFound() {
//        return HttpStatus.NOT_FOUND;
//    }
//}
package com.lokesh.MSdemo1.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.lokesh.MSdemo1.entity.Book;
import com.lokesh.MSdemo1.service.BookService;
@RestController
public class BookController
{
    @Autowired
    BookService bookService;

    @GetMapping(produces="application/json")
    public ResponseEntity<List<Book>> getAllBooks()
    {
        return new ResponseEntity<List<Book>>(bookService.getAllBooks(),HttpStatus.OK);
    }

    @GetMapping(value="/{bookId}",produces="application/json")
    public ResponseEntity<Book> getBookById(@PathVariable String bookId)
    {
        return new ResponseEntity<Book>(bookService.getBookById(bookId),HttpStatus.OK);
    }

    @PostMapping(consumes="application/json")
    public HttpStatus insertBook(@RequestBody Book book)
    {
        if(bookService.insertOrModifyBook(book))
            return HttpStatus.OK;
        return HttpStatus.NOT_MODIFIED;
    }

    @PutMapping(consumes="application/json")
    public HttpStatus modifyBook(@RequestBody Book book)
    {
        if(bookService.insertOrModifyBook(book))
            return HttpStatus.OK;
        return HttpStatus.NOT_MODIFIED;
    }

    @DeleteMapping("/{bookId}")
    public HttpStatus deleteBookById(@PathVariable String bookId)
    {
        bookService.deleteBookById(bookId);
        return HttpStatus.OK;
    }




      /*@ExceptionHandler(RuntimeException.class)
      public HttpStatus returnStatusNotFound()
      {
    	  return HttpStatus.NOT_FOUND;
      }*/
}
