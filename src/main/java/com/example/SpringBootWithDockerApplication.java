package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootWithDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWithDockerApplication.class, args);
    }

}

@RestController
class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World!";
    }

}
