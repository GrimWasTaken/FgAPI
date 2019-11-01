package com.fgproject.repository;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.fgproject.model.Character;

@Repository
public interface CharRepo extends MongoRepository<Character, BigInteger>{


}
