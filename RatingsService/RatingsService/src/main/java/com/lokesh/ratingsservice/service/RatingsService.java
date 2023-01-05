//package com.lokesh.ratingsservice.service;
//
//import com.lokesh.ratingsservice.entity.Ratings;
//import com.lokesh.ratingsservice.repository.RatingsRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import java.util.Optional;
//
//@Service
//public class RatingsService {
//    @Autowired
//    RatingsRepository ratingsRepository;
//
//    public Ratings getBookById(String bookId) {
//        System.out.println("From Ratings Service");
////        Optional<Ratings> r = ratingsRepository.findById(ratingId);
////        if(r.isPresent()) return r.get();
////        throw new RuntimeException();
//        Optional<Ratings> r = ratingsRepository.findByBookId(bookId);
//        if(r.isPresent()) return r.get();
//        return new Ratings();
//    }
//
//
//}
package com.lokesh.ratingsservice.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lokesh.ratingsservice.entity.Ratings;
import com.lokesh.ratingsservice.repository.RatingsRepository;
@Service
public class RatingsService
{
    @Autowired
    RatingsRepository ratingsRepository;

    public Ratings findByBookId(String bookId)
    {
        System.out.println("From Ratings Service");
        Optional<Ratings> r = ratingsRepository.findByBookId(bookId);
        if(r.isPresent()) return r.get();
        return new Ratings();
    }
}
