package com.raikar.service;

import com.raikar.model.User;
import com.raikar.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

//    public User getUser(User user) {
//      return userRepository.
//    }

    public User addUser(User user) {
       User userSave = userRepository.save(user);
       return userSave;
    }

    public User getUser(String id) {
        return userRepository.findByUserId(id);
    }




    public User update(User user) {
        return userRepository.save(user);
    }
    @Transactional
    public void removeUser(String id) {
        userRepository.deleteByUserId(id);

    }
}
