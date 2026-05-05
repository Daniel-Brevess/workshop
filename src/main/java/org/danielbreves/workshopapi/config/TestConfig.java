package org.danielbreves.workshopapi.config;

import org.danielbreves.workshopapi.entities.User;
import org.danielbreves.workshopapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User user1 = new User(null, "Daniel", "daniel@gmail.com", "99999999", "1234");
        userRepository.save(user1);
    }
}
