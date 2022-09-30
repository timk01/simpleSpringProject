package com.example.spring_simple_project.controller;

import com.example.spring_simple_project.exception.CustomException;
import com.example.spring_simple_project.model.User;
import com.example.spring_simple_project.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable int id) throws CustomException {
        return userService.getById(id);
    }

    @GetMapping()
    public List<User> getAll() {
        return userService.getAll();
    }

    @PostMapping()
    public User add(User user) {
        return userService.add(user);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable int id) {
        userService.remove(id);
    }
}
