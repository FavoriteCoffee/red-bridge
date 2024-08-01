package com.bridge.red.back.service;

import com.bridge.red.back.model.NewsArticle;
import com.bridge.red.back.repo.NewsArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NewsArticleService {

    private final NewsArticleRepository newsArticleRepository;
    public Iterable<NewsArticle> findAll(){
        return newsArticleRepository.findAll();
    }
    public NewsArticle findById(Long id) { return newsArticleRepository.findById(id).get();}
}
