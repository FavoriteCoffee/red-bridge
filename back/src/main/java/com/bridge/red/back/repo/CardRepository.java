package com.bridge.red.back.repo;

import com.bridge.red.back.model.Card;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<Card, Long> {
}
