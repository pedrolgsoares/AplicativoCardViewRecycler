package com.pedrolgsoares.aplicativoestudos.model;


public class Post {

    private int imageViewUser;
    private String textViewUser;
    private String textViewTime;
    private int imageViewPost;
    private String textViewPost;

    public Post() {
    }

    public Post(int imageViewUser, String textViewUser, String textViewTime, int imageViewPost, String textViewPost) {
        this.imageViewUser = imageViewUser;
        this.textViewUser = textViewUser;
        this.textViewTime = textViewTime;
        this.imageViewPost = imageViewPost;
        this.textViewPost = textViewPost;
    }

    public int getImageViewUser() {
        return imageViewUser;
    }

    public String getTextViewUser(){
        return textViewUser;
    }

    public String getTextViewTime(){
        return textViewTime;
    }

    public int getImageViewPost(){
        return imageViewPost;
    }

    public String getTextViewPost(){
        return textViewPost;
    }

    public void setImageViewUser(int imageViewUser) {
        this.imageViewUser = imageViewUser;
    }

    public void setTextViewUser(String textViewUser) {
        this.textViewUser = textViewUser;
    }

    public void setTextViewTime(String textViewTime) {
        this.textViewTime = textViewTime;
    }

    public void setImageViewPost(int imageViewPost) {
        this.imageViewPost = imageViewPost;
    }

    public void setTextViewPost(String textViewPost) {
        this.textViewPost = textViewPost;
    }
}
