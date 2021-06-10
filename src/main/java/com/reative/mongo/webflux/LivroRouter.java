package com.reative.mongo.webflux;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration
public class LivroRouter {
    @Bean
    public RouterFunction<ServerResponse> route(LivroHandler handler){
        return RouterFunctions
                .route(GET("/livro").and(accept(MediaType.APPLICATION_JSON)), handler::buscaAll)
                .andRoute(GET("/livro/{id}").and(accept(MediaType.APPLICATION_JSON)), handler::buscaId)
                .andRoute(POST("/livro").and(accept(MediaType.APPLICATION_JSON)), handler::salve);
    }


}
