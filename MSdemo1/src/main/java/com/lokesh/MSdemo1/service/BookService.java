//package com.lokesh.MSdemo1.service;
//
//import com.lokesh.MSdemo1.beans.Ratings;
//import com.lokesh.MSdemo1.entity.Book;
//import com.lokesh.MSdemo1.repository.BookRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class BookService {
//    @Autowired
//    BookRepository bookRepository;
//
//    @Autowired
//    RestTemplate restTemplate;
//    @Transactional(readOnly = true)
//    public List<Book> getAllBooks() {
//        return bookRepository.findAll();
//    }
//
//    @Transactional(readOnly = true)
//    public Book getBookById(String bookId) {
//        Optional<Book> b = bookRepository.findById(bookId);
//        if(b.isPresent())
//            return b.get();
//        throw new RuntimeException();
//    }
//
//    public boolean insertOrModifyBook(Book book) {
//        return (bookRepository.save(book) != null);
//    }
//
//    public boolean deleteBookById(String bookId) {
//        long count = bookRepository.getBookCountById(bookId);
//        if(count == 1) {
//            bookRepository.deleteById(bookId);
//            return count > bookRepository.getBookCountById(bookId);
//        } throw new RuntimeException();
//    }
//
//    @LoadBalance
//    public Ratings getRatingsById(int ratingId){
//
//    }
//}

package com.lokesh.MSdemo1.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import com.lokesh.MSdemo1.beans.Ratings;
import com.lokesh.MSdemo1.entity.Book;
import com.lokesh.MSdemo1.repository.BookRepository;
@Service
public class BookService
{
    @Autowired
    BookRepository bookRepository;

    @Autowired
    RestTemplate restTemplate;

    @Transactional(readOnly=true)
    public List<Book> getAllBooks()
    {
        return bookRepository.findAll();
    }

    @Transactional(readOnly=true)
    public Book getBookById(String bookId)
    {
        Optional<Book> b = bookRepository.findById(bookId);
        if(b.isPresent())
        {

            Book book = b.get();
            book.setRatings(getRatingsByBookId(bookId));
            return b.get();
        }
        return new Book();
    }

    public boolean insertOrModifyBook(Book book)
    {
        return (bookRepository.save(book) != null);
    }

    public boolean deleteBookById(String bookId)
    {
        long count = bookRepository.getBookCountById(bookId);
        if(count==1)
        {
            bookRepository.deleteById(bookId);
            return count > bookRepository.getBookCountById(bookId);
        }
        throw new RuntimeException();
    }


    //new Object() argument is optional here
    //
    //@LoadBalanced
    public Ratings getRatingsByBookId(String bookId)
    {
        return restTemplate.getForEntity("http://rating-service/"+bookId, Ratings.class,new Object()).getBody();
        //return restTemplate.getForEntity("http://localhost:8085/"+bookId, Ratings.class,new Object()).getBody();
    }

}
