package com.lokesh.feingcliendemo.dao;

import com.lokesh.feingcliendemo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDAO extends JpaRepository<Book, String> {
}
