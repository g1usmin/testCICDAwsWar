package com.digitalhouse.demoAws.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladoraPrincipal {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hola Gabi, por fin salio";
    }

    @GetMapping("/hello/{name}")
    public String sayHelloName(@PathVariable String name) {
        return "Hello World " + name;
    }




}
