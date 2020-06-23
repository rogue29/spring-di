package io.rogue.springdi.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HelloWorldController {

    public String sayHello() {
        System.out.println("Hello World");
        return "Hi Folks!";
    }
}
