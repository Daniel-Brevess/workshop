package org.danielbreves.workshopapi.resources;

import org.danielbreves.workshopapi.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserResources {

    @GetMapping("/get")
    public ResponseEntity<User> findAllUsers() {

        User user = new User(1, "Daniel", "daniel@gmail.com", "99999999", "1234");

        return ResponseEntity.ok(user);

    }

}
