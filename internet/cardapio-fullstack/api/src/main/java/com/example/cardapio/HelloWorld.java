package com.example.cardapio;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @RequestMapping(name = "/")
    public String hello (){
        return "Hello World";
    }
}
