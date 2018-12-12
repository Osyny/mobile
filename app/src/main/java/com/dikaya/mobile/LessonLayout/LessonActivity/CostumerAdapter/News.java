package com.dikaya.mobile.LessonLayout.LessonActivity.CostumerAdapter;

import java.util.Date;

public class News {
    protected String title;
    protected String context;
    protected Date date;
    protected String imagePath;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getContext() {
        return context;
    }

    public Date getDate() {
        return date;
    }

    public String getImagePass() {
        return imagePath;
    }
}
