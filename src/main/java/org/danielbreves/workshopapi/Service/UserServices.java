package org.danielbreves.workshopapi.Service;

import org.danielbreves.workshopapi.entities.User;
import org.danielbreves.workshopapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;

    public List<User> FindAll(){
       return userRepository.findAll();
    }

    public User FindById(Long id){
        Optional<User> obj = userRepository.findById(id);
        return obj.get();
    }

}
