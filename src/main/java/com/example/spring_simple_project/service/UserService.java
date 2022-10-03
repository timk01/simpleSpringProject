package com.example.spring_simple_project.service;

import com.example.spring_simple_project.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public User getById(int id) {
        return new User(id, "Ivanov Ivan Ivanovich", 35, "ivanov@gmail.com");
    }

    public List<User> getAll() {
        return List.of(
                new User(1, "Ivanov Ivan Ivanovich", 35, "ivanov@gmail.com"),
                new User(1, "Ivanov Ivan Ivanovich2", 36, "ivanov2@gmail.com")
        );
    }

    public User add(User user) {
        return new User(3, "Sergeev Sergey Sergeevich", 35, "sergeev@gmail.com");
    }

    public void remove(int id) {
        System.out.println("id " + id + " 123");
    }
}
