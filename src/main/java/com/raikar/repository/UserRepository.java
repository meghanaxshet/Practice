package com.raikar.repository;

import com.raikar.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    User findByUserId(String id);

    void deleteByUserId(String id);
}


