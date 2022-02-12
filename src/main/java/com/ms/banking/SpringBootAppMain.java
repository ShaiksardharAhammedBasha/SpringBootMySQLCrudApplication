package com.ms.banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ms.banking"})
@EnableAutoConfiguration
public class SpringBootAppMain {
    public static void main(String[] args) {
         SpringApplication.run(SpringBootAppMain.class);
    }
}
