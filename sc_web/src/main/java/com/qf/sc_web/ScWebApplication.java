package com.qf.sc_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf")
public class ScWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScWebApplication.class, args);
    }

}
