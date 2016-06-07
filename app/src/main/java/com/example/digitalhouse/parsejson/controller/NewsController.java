package com.example.digitalhouse.parsejson.controller;

import android.content.Context;

import com.example.digitalhouse.parsejson.dao.NewsDAO;
import com.example.digitalhouse.parsejson.model.News;

/**
 * Created by digitalhouse on 6/06/16.
 */
public class NewsController {

    public News getNews(Context context){
        NewsDAO newsDAO = new NewsDAO();

        News result = newsDAO.getNews(context);

        return result;
    }

}
