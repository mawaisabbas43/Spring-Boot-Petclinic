package com.petclinic.springbootpetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootPetclinicApplication {

    private static ApplicationContext ctx;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPetclinicApplication.class, args);
    }

}
