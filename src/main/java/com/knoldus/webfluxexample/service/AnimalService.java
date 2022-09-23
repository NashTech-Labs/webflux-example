package com.knoldus.webfluxexample.service;

import com.knoldus.webfluxexample.entity.Animal;
import com.knoldus.webfluxexample.repository.ReactiveRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AnimalService {
    @Autowired
    private ReactiveRepository reactiveRepository;

    public Mono<Animal> saveDataIntoDatabase(Animal animal){
        return reactiveRepository.save(animal);
    }
    public Flux<Animal> findAnimalByName(){
        return reactiveRepository.findAll();
    }
}
