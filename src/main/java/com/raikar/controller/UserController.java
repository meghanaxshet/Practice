package com.raikar.controller;

import com.raikar.model.User;
import com.raikar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public User getUser(@RequestParam("userId") String id ){
        return userService.getUser(id);
    }
    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @DeleteMapping("/removeUser/{id}")
    public void removeUser(@PathVariable String id){
     userService.removeUser(id);
    }

    @PutMapping("/udateUser/{id}")
    public User update(@PathVariable int id,@RequestBody User user){
        user.setId(id);
        return userService.update(user);
    }


}
