//package com.example.gateway.config;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class GatewayConfig {
//
//    @Bean
//    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//
//        return builder.routes()
//                .route(p -> p
//                        .path("/demo1")
////                        .filters(f -> f.addRequestHeader("Hello", "World"))
//                        .uri("http://localhost:8081"))
//                .route(p -> p
//                        .path("/demo2")
////                        .filters(f -> f.addRequestHeader("Hello", "World"))
//                        .uri("http://localhost:8082"))
//                .route(p -> p
//                        .path("/demo3")
////                        .filters(f -> f.addRequestHeader("Hello", "World"))
//                        .uri("http://localhost:8083"))
//                .build();
//    }
//}
