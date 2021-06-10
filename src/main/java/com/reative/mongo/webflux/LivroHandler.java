package com.reative.mongo.webflux;

import com.reative.mongo.model.Livro;
import com.reative.mongo.repository.LivroRepository;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.BodyInserters.fromPublisher;

@Component
public class LivroHandler {

    private LivroRepository repository;

    public LivroHandler(LivroRepository repository) {
        this.repository = repository;
    }

    public Mono<ServerResponse> buscaAll(ServerRequest request){
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(repository.findAll(), Livro.class);
    }

    public Mono<ServerResponse> buscaId(ServerRequest request){
        String id = request.pathVariable("id");
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(repository.findById(id), Livro.class);
    }

    public  Mono<ServerResponse> salve(ServerRequest request){
        final Mono<Livro> livro = request.bodyToMono(Livro.class);

        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(fromPublisher(livro.flatMap(repository::save), Livro.class));
    }
}
