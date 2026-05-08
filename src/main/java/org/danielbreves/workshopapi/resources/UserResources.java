package org.danielbreves.workshopapi.resources;

import org.danielbreves.workshopapi.Service.UserServices;
import org.danielbreves.workshopapi.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserResources {

    @Autowired
    private UserServices userServices;

    @GetMapping(value = "/get")
    public ResponseEntity<List<User>> findAllUsers() {

        List<User> list = userServices.FindAll();

        return ResponseEntity.ok(list);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User obj =  userServices.FindById(id);

        return ResponseEntity.ok().body(obj);
    }

}
