package com.bridge.red.back.repo;

import com.bridge.red.back.model.NewsArticle;
import org.springframework.data.repository.CrudRepository;

public interface NewsArticleRepository extends CrudRepository<NewsArticle, Long> {
}
