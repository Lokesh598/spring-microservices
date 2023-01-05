//package com.lokesh.ratingsservice.controller;
//
//import com.lokesh.ratingsservice.entity.Ratings;
//import com.lokesh.ratingsservice.service.RatingsService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class RatingsController {
//    @Autowired
//    RatingsService ratingsService;
//
//    @GetMapping(value = "/{ratingId}",produces = "application/json")
//    public Ratings getRatingsById(@PathVariable String bookId) {
////        return new ResponseEntity<Ratings>(ratingsService.getRatingsById(ratingId), HttpStatus.OK);
//        return ratingsService.findByBookId(bookId);
//    }
////    @ExceptionHandler(RuntimeException.class)
////    public HttpStatus returnStatusCode() {
////        return HttpStatus.NOT_FOUND;
////    }
//}

package com.lokesh.ratingsservice.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.lokesh.ratingsservice.entity.Ratings;
import com.lokesh.ratingsservice.service.RatingsService;
@RestController
public class RatingsController
{
    @Autowired
    RatingsService ratingsService;

    @GetMapping(value="/{bookId}",produces="application/json")
    public Ratings getRatingsById(@PathVariable String bookId)
    {
        return ratingsService.findByBookId(bookId);
    }

      /*@ExceptionHandler(RuntimeException.class)
      public HttpStatus returnStatusCode()
      {
    	  return HttpStatus.NOT_FOUND;
      }*/
}

