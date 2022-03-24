package com.joserafael.monorepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.joserafael.monorepo.application")
public class MonorepoApp {

    public static void main(String[] args) {
        SpringApplication.run(MonorepoApp.class, args);
    }
}
