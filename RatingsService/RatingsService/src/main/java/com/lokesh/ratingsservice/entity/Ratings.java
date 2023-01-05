//package com.lokesh.ratingsservice.entity;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//
//@Entity
//public class Ratings {
//    @Id
//    @Column(name = "ratingid")
//    private int ratingId;
//    @Column(name = "rating")
//    private int rating;
//    @Column(name = "comments")
//    private String comments;
//
//    public Ratings() {}
//
//    public Ratings(int ratingId, int rating, String comments) {
//        this.ratingId = ratingId;
//        this.rating = rating;
//        this.comments = comments;
//    }
//
//    public int getRatingId() {
//        return ratingId;
//    }
//
//    public void setRatingId(int ratingId) {
//        this.ratingId = ratingId;
//    }
//
//    public int getRating() {
//        return rating;
//    }
//
//    public void setRating(int rating) {
//        this.rating = rating;
//    }
//
//    public String getComments() {
//        return comments;
//    }
//
//    public void setComments(String comments) {
//        this.comments = comments;
//    }
//}
package com.lokesh.ratingsservice.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Ratings
{
    @Id
    @Column(name="ratingid")
    private int ratingId;
    @Column(name="rating")
    private int rating;
    @Column(name="comments")
    private String comments;
    @Column(name="bookid")
    private String bookId;
    public Ratings() {}

    public Ratings(int ratingId, int rating, String comments,String bookId)
    {
        this.ratingId = ratingId;		this.rating = rating;
        this.comments = comments;       this.bookId = bookId;
    }

    public int getRatingId() {
        return ratingId;
    }

    public void setRatingId(int ratingId) {
        this.ratingId = ratingId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }



}
