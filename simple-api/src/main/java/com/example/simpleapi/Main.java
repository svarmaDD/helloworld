// -----------------------------------------------------------------------------
// FILE 2: The Java Application (Main.java)
// Create the directory structure 'simple-api/src/main/java/com/example/simpleapi/'
// and place this file inside it.
// -----------------------------------------------------------------------------
// src/main/java/com/example/simpleapi/Main.java
package com.example.simpleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello! This is the simple API.";
    }
}
