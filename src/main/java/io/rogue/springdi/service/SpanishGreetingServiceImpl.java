package io.rogue.springdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service(value = "greetingService")
public class SpanishGreetingServiceImpl implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hola - From Spain";
    }
}
