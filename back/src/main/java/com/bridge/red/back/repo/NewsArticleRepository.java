package com.bridge.red.back.repo;

import com.bridge.red.back.model.NewsArticle;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface NewsArticleRepository extends CrudRepository<NewsArticle, Long> {
}
