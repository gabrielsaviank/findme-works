package com.allesys.findmeworks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.allesys.findmeworks")
public class FindmeWorksApplication {

    public static void main(String[] args) {
        SpringApplication.run(FindmeWorksApplication.class, args);
    }
}
