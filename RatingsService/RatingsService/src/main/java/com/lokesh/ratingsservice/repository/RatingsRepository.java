package com.lokesh.ratingsservice.repository;
import java.util.Optional;
import com.lokesh.ratingsservice.entity.Ratings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingsRepository extends JpaRepository<Ratings, Integer> {
    public Optional<Ratings> findByBookId(String bookId);
}
