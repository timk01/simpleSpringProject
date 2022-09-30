package com.example.spring_simple_project.service;

import com.example.spring_simple_project.converter.UserMapper;
import com.example.spring_simple_project.entity.UserEntity;
import com.example.spring_simple_project.exception.CustomException;
import com.example.spring_simple_project.model.User;
import com.example.spring_simple_project.userrepo.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.example.spring_simple_project.converter.UserMapper.fromEntity;
import static com.example.spring_simple_project.converter.UserMapper.toEntity;

@Service
public class UserService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User getById(int id) throws CustomException {
        return userRepo.getById(id).map(UserMapper::fromEntity).orElse(null);
        //throw new CustomException("cannot find user with such id!");
    }

    public List<User> getAll() {
        return userRepo.getAll().stream().map(UserMapper::fromEntity).toList();
    }

    public User add(User user) {
        user.setId(0); //check exc, OR check if id !=0 return;
        return fromEntity(userRepo.add(toEntity(user)));
    }

    public void remove(int id) {
        userRepo.remove(id);
    }
}
