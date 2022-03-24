package com.joserafael.monorepo;

import com.joserafael.monorepo.application.CommandLineRunnerBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MonorepoAppGamma {

    @Bean
    public CommandLineRunnerBean commandLineRunnerBean() {
        return new CommandLineRunnerBean();
    }

    public static void main(String[] args) {
        SpringApplication.run(MonorepoAppGamma.class, args);
    }
}
