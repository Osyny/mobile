package com.dikaya.mobile.LessonLayout.LessonActivity.Fragments;

import java.util.Date;

public interface ISearchNews {
    String getTopic();
    Date getDateFrom();
    Date getDateTo();

class News {

    protected String title;
    protected String context;
    protected Date date;
    protected String imagePath;


    public String getTitle() {
        return title;
    }

    public String getContext() {
        return context;
    }

    public Date getDate() {
        return date;
    }

    public String getImagePath() {
        return imagePath;
    }

    public News(String title, String context, Date date, String imagePath) {
        this.title = title;
        this.context = context;
        this.date = date;
        this.imagePath = imagePath;
    }
}}
