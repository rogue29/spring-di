package io.rogue.springdi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FakeConfig {
    private final String user;
    private final String password;
    private final String url;

    public FakeConfig(@Value("${rogue.db.user}") String user,
                      @Value("${rogue.db.password}") String password,
                      @Value("${rogue.db.url}") String url ) {
        this.user = user;
        this.password = password;
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }
}
