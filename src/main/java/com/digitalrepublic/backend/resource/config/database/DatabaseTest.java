package com.digitalrepublic.backend.resource.config.database;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class DatabaseTest implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

    }
}
