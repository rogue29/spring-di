package io.rogue.springdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service(value = "greetingService")
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hello World!";
    }
}
