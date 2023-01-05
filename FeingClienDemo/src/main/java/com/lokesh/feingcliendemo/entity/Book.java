package com.lokesh.feingcliendemo.entity;


        import com.lokesh.feingcliendemo.model.Ratings;

        import javax.persistence.Column;
        import javax.persistence.Entity;
        import javax.persistence.Id;
        import javax.persistence.Table;
        import javax.persistence.Transient;


@Entity
@Table(name="book")
public class Book
{
    @Id
    @Column(name="bookid")
    private String  bookId;

    @Column(name="title")
    private String bookTitle;

    @Column(name="author")
    private String bookAuthor;

    @Column(name="price")
    private double bookPrice;

    @Transient
    private Ratings ratings;

    public Book() {}

    public Book(String bookId, String bookTitle, String bookAuthor, double bookPrice)
    {
        this.bookId = bookId;		this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;		this.bookPrice = bookPrice;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Ratings getRatings() {
        return ratings;
    }

    public void setRatings(Ratings ratings) {
        this.ratings = ratings;
    }


}


