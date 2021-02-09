package com.example.demo.src.route.ahth;

import com.example.demo.common.config.security.user.UserCredentials;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import java.util.HashMap;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
@AllArgsConstructor
public class AuthRouter {

    private HashMap<String, UserCredentials> users;

    @Bean
    RouterFunction<ServerResponse> authRouters() {
        return route().path("/auth", builder ->
                builder
                .GET("/check", serverRequest -> ServerResponse.ok().build())
                .POST("/signUp", serverRequest -> ServerResponse.noContent().build())
                .POST("/signIn", serverRequest -> ServerResponse.noContent().build())
        ).build();
    }
//    RouterFunction<ServerResponse> route = route()
//            .path("/auth", builder -> builder
//                .POST("/signUp", serverRequest -> ServerResponse.noContent().build())
//                .POST("/check", serverRequest -> {
//                    return serverRequest.bodyToMono(UserCredentials.class)
//                            .doOnNext(userCredentials -> {
//                            })
//                            .thenEmpty(Mono.error(new Exception()))
//                            .doOnError(throwable -> ServerResponse.noContent().build())
//                            .then(ServerResponse.noContent().build());
//
//                }))
//            .build();
}
