package com.joserafael.monorepo.application;

import org.springframework.boot.CommandLineRunner;

public class CommandLineRunnerBean implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunnerBean");
    }
}
