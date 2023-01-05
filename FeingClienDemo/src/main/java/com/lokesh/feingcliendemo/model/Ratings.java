package com.lokesh.feingcliendemo.model;

public class Ratings {
    private int ratingId;
    private int rating;
    private String comments;

    public Ratings () {}

    public Ratings(int ratingId, int rating, String comments) {
        this.ratingId = ratingId;
        this.rating = rating;
        this.comments = comments;
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

}
