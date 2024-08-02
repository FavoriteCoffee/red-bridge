package com.bridge.red.back.controller;

import com.bridge.red.back.dto.CardInfo;
import com.bridge.red.back.model.Card;
import com.bridge.red.back.service.CardService;
import com.bridge.red.back.service.MappingService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/card")
public class CardController {
    private final CardService cardService;
    private final MappingService mappingService;

    private final Logger logger = LoggerFactory.getLogger(CardController.class);
    @GetMapping("/get-all")
    public ResponseEntity<Object> getAllCards(){
        try {
            Iterable<Card> cards = cardService.findAll();
            return new ResponseEntity<Object>(cards, HttpStatus.OK);
        } catch(Exception ex) {
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/get-by-id/{id}")
    public ResponseEntity<Object> getCardById(@PathVariable("id") Long id){
        try {
            Card card = cardService.findById(id);
            return new ResponseEntity<Object>(card, HttpStatus.OK);
        } catch(Exception ex) {
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/get-info-by-id/{id}")
    public ResponseEntity<Object> getCardInfoById(@PathVariable("id") Long id){
        try {
            Card card = cardService.findById(id);
            CardInfo cardInfo = mappingService.mapToCardInfo(card);
            return new ResponseEntity<Object>(cardInfo, HttpStatus.OK);
        } catch(Exception ex) {
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }
}
