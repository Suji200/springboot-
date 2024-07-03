package com.example.crudoperation.controller;

import com.example.crudoperation.Model.User;
import com.example.crudoperation.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {
    @Autowired
    private UserRepository userRepository;


    @GetMapping("Api/v1")
    public String getPage() {
        return "Welcome";
    }

    @GetMapping("/user")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/save")
    public String saveUser(@RequestBody User user) {
        userRepository.save(user);
        return "saved..";
    }

    @PutMapping(value = "update/{id}")
    public String updateuser(@PathVariable long id, @RequestBody User user) {
        User updateduser = userRepository.findById(id).get();
        user.setFirsName(user.getFirsName());
        updateduser.setLastName(user.getLastName());
        updateduser.setAge(user.getAge());
        updateduser.setOccupation(user.getOccupation());
        userRepository.save(updateduser);
        return "updated....";
    }

    @DeleteMapping(value = "/delete/{id}")
    public  String deleteUser(@PathVariable long id){
        User deleteUser = userRepository.findById(id).get();
        userRepository.delete(deleteUser);
        return "deleted...userid : "+id;
    }
}