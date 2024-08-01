package com.bridge.red.back.controller;

import com.bridge.red.back.model.NewsArticle;
import com.bridge.red.back.service.NewsArticleService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.connector.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {
    private final NewsArticleService newsArticleService;
    private final Logger logger = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/news-article/get-all")
    public ResponseEntity<Object> getAllNews(){
        try {
            Iterable<NewsArticle> articles = newsArticleService.findAll();
            return new ResponseEntity<Object>(articles, HttpStatus.OK);
        } catch(Exception ex) {
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/news-article/get-by-id/{id}")
    public ResponseEntity<Object> getById(@PathVariable("id") Long id){
        try {
            NewsArticle article = newsArticleService.findById(id);
            return new ResponseEntity<Object>(article, HttpStatus.OK);
        } catch(Exception ex) {
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }
}
