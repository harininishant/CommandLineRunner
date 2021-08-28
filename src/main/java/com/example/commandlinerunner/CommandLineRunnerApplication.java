package com.example.commandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CommandLineRunnerApplication {

    public static void main(String[] args) {
        //CommandLineRunner runner = new MyCommandLineRunner();
         CommandLineRunner runner = args1 -> {};// this is the same thing but written using lambda
        SpringApplication.run(CommandLineRunnerApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(){
        // return object of any class that is implementing this method.
        //return new MyCommandLineRunner();

        return args1 -> {};//  hence we are not returning void but we are implementing the
        // Bean using lambda retuning the object through lambda.

    }
/*
By implementing the CommandLineRunner,
 the run() method of the MyRunner class will be executed after the application starts.

MyRunner is also decorated with @Component, so it will be autodetected and registered as well.
 */

}
