package com.lokesh.feingcliendemo.service;

import com.lokesh.feingcliendemo.dao.BookDAO;
import com.lokesh.feingcliendemo.entity.Book;
import com.lokesh.feingcliendemo.feingclient.RatingClient;
import com.lokesh.feingcliendemo.model.Ratings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

	@Autowired
	BookDAO bdao;

	@Autowired
	RatingClient rClient;

	public Book getBookByBookId(String bookId) {
		Optional<Book> b = bdao.findById(bookId);
		if (b.isPresent()) {
			Book b1 = b.get();
			b1.setRatings(getRatingsByBookId(bookId));
			return b1;
		}
		return new Book();
	}

	public Ratings getRatingsByBookId(String bookId) {
		return rClient.getRatingByBookId(bookId);
	}
}
