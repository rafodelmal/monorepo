package com.joserafael.monorepo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MonorepoAppBeta implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MonorepoAppBeta.class, args);
    }
    @Override
    public void run(String... args) {
        System.out.println("MonorepoAppBeta");
    }
}
