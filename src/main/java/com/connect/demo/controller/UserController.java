package com.connect.demo.controller;

import com.connect.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.connect.demo.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
     @Autowired
    UserService userService;

     @GetMapping("/")
    public List<User> getAll(){
         return userService.getAll();
     }
     @PostMapping("/add")
     public User addUser(@RequestBody User user){
         return userService.addUser(user);
     }
    @PostMapping("/edit")
    public User editUser(@RequestBody User user){
        return userService.editUser(user);
    }
    @GetMapping("/getByEmail")
    public User getByMail(@RequestParam(name = "username") String username){
        return userService.getUserByUsername(username);
    }

}
