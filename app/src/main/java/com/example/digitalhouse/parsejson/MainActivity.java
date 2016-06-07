package com.example.digitalhouse.parsejson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.digitalhouse.parsejson.controller.NewsController;
import com.example.digitalhouse.parsejson.model.News;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loadNewsClick(View view){

        NewsController newsController = new NewsController();
        News news = newsController.getNews(this);

    }

}
