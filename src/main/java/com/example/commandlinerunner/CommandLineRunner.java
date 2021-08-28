package com.example.commandlinerunner;

@FunctionalInterface
public interface CommandLineRunner {
    void run(String... args) throws Exception;
}
