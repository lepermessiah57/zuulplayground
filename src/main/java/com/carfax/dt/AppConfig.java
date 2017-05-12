package com.carfax.dt;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@Configuration
public class AppConfig {

    @Bean
    PreFilter preFilter(){
        return new PreFilter();
    }

    @Bean
    RouteBarFilter routeBarFilter(){
        return new RouteBarFilter();
    }

}
