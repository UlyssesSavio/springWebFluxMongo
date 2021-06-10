package com.reative.mongo.utils;

import com.reative.mongo.model.Livro;
import com.reative.mongo.repository.LivroRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
public class LivroData //implements CommandLineRunner
{

//    private final LivroRepository repository;
//
//    public LivroData(LivroRepository repository) {
//        this.repository = repository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        repository.deleteAll()
//                .thenMany(
//                        Flux.just("livro 1", "livro 2", "livro 3")
//                        .map(n -> new Livro(n))
//                        .flatMap(repository::save))
//                .subscribe(System.out::println);
//    }
}
