package com.knoldus.webfluxexample.controller;


import com.knoldus.webfluxexample.entity.Animal;
import com.knoldus.webfluxexample.service.AnimalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/animal")
public class AnimalController {

	@Autowired
    private final AnimalService animalService;
    public AnimalController(AnimalService animalService){
        this.animalService= animalService;
    }

    @PostMapping("/add")
    public ResponseEntity<Mono<Animal>> saveDataIntoDatabase(@RequestBody Animal animal){
        return new ResponseEntity<Mono<Animal>>(animalService.saveDataIntoDatabase(animal) , new HttpHeaders() , HttpStatus.OK);
    }
    @GetMapping("/animalByName")
    public ResponseEntity<Flux<Animal>> findAnimalByName(){
        return new ResponseEntity<Flux<Animal>>(animalService.findAnimalByName(), new HttpHeaders() ,HttpStatus.OK);
    }
}
