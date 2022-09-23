package com.knoldus.webfluxexample.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.knoldus.webfluxexample.entity.Animal;


@Repository
public interface ReactiveRepository extends ReactiveMongoRepository<Animal ,Integer> {
}
