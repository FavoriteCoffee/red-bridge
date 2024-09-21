package com.bridge.red.back.service;

import com.bridge.red.back.dto.CardInfo;
import com.bridge.red.back.model.Card;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class MappingService {

    public CardInfo mapToCardInfo(Card card){
        CardInfo cardInfo = new CardInfo();
        cardInfo.setName(card.getName());
        cardInfo.setAttachment(card.getAttachments().iterator().next());
        return cardInfo;
    }

    public Iterable<CardInfo> mapToCardInfo(Iterable<Card> cards){

        List<CardInfo> cardInfos = new ArrayList<>();

        for (Card card : cards) {
            cardInfos.add(mapToCardInfo(card));
        }

        return cardInfos;
    }
}
