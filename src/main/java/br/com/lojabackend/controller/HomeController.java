package br.com.lojabackend.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String home(){
        return "Hello World!";
    }
    
    public static void main(String[] args) {
        SpringApplication.run(HomeController.class, args);
    }
}
