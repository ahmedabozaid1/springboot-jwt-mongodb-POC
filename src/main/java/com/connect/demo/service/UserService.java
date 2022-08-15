package com.connect.demo.service;

import com.connect.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connect.demo.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getAll(){
        return userRepository.findAll();
    }
    public User addUser(User user){
        return  userRepository.insert(user);
    }
    public User editUser(User user){
        return  userRepository.save(user);
    }
    public User getUserByUsername(String username){
        return  userRepository.findByUsername(username);
    }
    public boolean isUserExistByEmail(String email){
        return  userRepository.existsByEmail(email);
    }
    public boolean isUserExistByUsername(String username){
        return  userRepository.existsByUsername(username);
    }


}
