package io.rogue.springdi.controller;

import io.rogue.springdi.service.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String sayHello() {
        return greetingService.getGreeting();
    }
}
