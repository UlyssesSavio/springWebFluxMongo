package com.reative.mongo.controller;

import com.reative.mongo.model.Livro;
import com.reative.mongo.repository.LivroRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.BodyInserters.fromPublisher;

//@RestController
//@RequestMapping("/livro")
public class LivroController {
//
//    private LivroRepository repository;
//
//    public LivroController(LivroRepository repository) {
//        this.repository = repository;
//    }
//
//    @GetMapping()
//    public Flux<Livro> buscaTodos(){
//        return repository.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public Mono<Livro> buscaUm(@PathVariable  String id){
//        return repository.findById(id);
//    }
//
//    @PostMapping()
//    public Mono<Livro> salva(@RequestBody  Livro livro){
//        return repository.save(livro);
//    }
//

}
