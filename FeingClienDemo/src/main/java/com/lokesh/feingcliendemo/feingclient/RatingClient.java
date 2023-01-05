package com.lokesh.feingcliendemo.feingclient;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.lokesh.feingcliendemo.model.Ratings;

@Component
@FeignClient(value = "rating-service",url = "http://localhost:8085")
public interface RatingClient {
    @GetMapping(value = "/{bookId}", produces = "application/json")
    public Ratings getRatingByBookId(@PathVariable String bookId);
}
