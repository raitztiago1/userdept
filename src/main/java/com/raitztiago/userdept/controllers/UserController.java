package com.raitztiago.userdept.controllers;

import com.raitztiago.userdept.entities.User;
import com.raitztiago.userdept.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll() {
        List<User> response = new ArrayList<>();
        try {
            response = repository.findAll();
        } catch (Exception e) {
            e.fillInStackTrace();
        }
        return response;
    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id) {
        User response = new User();
        try {
            response = repository.findById(id).get();
        } catch (Exception e) {
            e.fillInStackTrace();
        }
        return response;
    }

    @PostMapping
    public User insert(@RequestBody User user) {
        User response = new User();
        try {
            response = repository.save(user);
        } catch (Exception e) {
            e.fillInStackTrace();
        }
        return response;
    }

}
