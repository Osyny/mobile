package com.dikaya.mobile.LessonLayout.LessonActivity.CostumerAdapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.dikaya.mobile.LessonLayout.LessonActivity.Fragments.ISearchNews;
import com.dikaya.mobile.LessonLayout.LessonActivity.Fragments.NewsFragment;
import com.dikaya.mobile.LessonLayout.LessonActivity.Fragments.OnSearchListener;
import com.dikaya.mobile.R;

import java.util.ArrayList;
import java.util.Date;

public class NewsActivity extends AppCompatActivity implements OnSearchListener{

    protected void onCreate(Bundle stage){
        super.onCreate(stage);


//        setContentView(R.layout.news_list_layout);
//
//        ArrayList<News> news = new ArrayList<>();
//
//        for(int i=1; i<=10;i++)
//            news.add(new News("Title "+i, "Context dfjhsd gjklhsdfjkgh lsdfhglkjsdfhjlkgh sdlfjkh  kghdjkfh"+i,new Date(),"path"));
//
//        ListView  listNews = (ListView) findViewById(R.id.listNews);
//        NewsAdapter adapter = new NewsAdapter(this,R.layout.news_layout,news);


     //   listNews.setAdapter(adapter);

        setContentView(R.layout.news_activity_layout);


    }

    @Override
    public void onSearch(ISearchNews sender) {

       // NewsFragment newsFragment = (NewsFragment)getFragmentManager().findFragmentById();

    }


}
