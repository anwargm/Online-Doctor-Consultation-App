package com.example.doctorconsultantapp;

public class ReviewDetails implements Comparable
{
    String ReviewId;
    String P_key;
    String D_key;
    String Rating;
    String Comment;
    String Date;
    Long Time;


    public ReviewDetails()
    {

    }

    public ReviewDetails(String reviewId, String p_key, String d_key, String rating, String comment, String date, Long time) {
        ReviewId = reviewId;
        P_key = p_key;
        D_key = d_key;
        Rating = rating;
        Comment = comment;
        Date = date;
        Time = time;
    }

    public String getReviewId() {
        return ReviewId;
    }

    public void setReviewId(String reviewId) {
        ReviewId = reviewId;
    }

    public String getP_key() {
        return P_key;
    }

    public void setP_key(String p_key) {
        P_key = p_key;
    }

    public String getD_key() {
        return D_key;
    }

    public void setD_key(String d_key) {
        D_key = d_key;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public Long getTime() {
        return Time;
    }

    public void setTime(Long time) {
        Time = time;
    }

    @Override
    public int compareTo(Object o) {
        ReviewDetails o2  = (ReviewDetails) o;
        return (int) (o2.Time - this.Time);
    }
}
