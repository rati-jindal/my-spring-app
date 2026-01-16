package com.logicorp.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventoryApplication {

    public static void main(String[] args) {
        // We just start the engine.
        // Spring Boot automatically finds the Controllers and Repositories.
        SpringApplication.run(InventoryApplication.class, args);
    }
}