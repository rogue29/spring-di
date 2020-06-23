package io.rogue.springdi.service;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hello World!";
    }
}
