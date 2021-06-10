package com.reative.mongo.repository;

import com.reative.mongo.model.Livro;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface LivroRepository extends ReactiveMongoRepository<Livro, String> {
}
