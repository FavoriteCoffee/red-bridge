package com.bridge.red.back.service;

import com.bridge.red.back.model.Card;
import com.bridge.red.back.model.NewsArticle;
import com.bridge.red.back.repo.CardRepository;
import com.bridge.red.back.repo.NewsArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CardService {
    private final CardRepository cardRepository;
    public Iterable<Card> findAll(){
        return cardRepository.findAll();
    }
    public Card findById(Long id) { return cardRepository.findById(id).get();}
}
