package com.lokesh.MSdemo1.repository;

import com.lokesh.MSdemo1.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BookRepository extends JpaRepository<Book, String> {
    @Query("select count(*) from Book where bookid=?1")
    public long getBookCountById(@Param(value = "1") String bookId);
}
