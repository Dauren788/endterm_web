package org.example.repository;

import org.example.model.UserCredentials;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    private final static String password = "qwerty123";
    public UserCredentials findUserByUserName(String username){
        return new UserCredentials(username, password);
    }
}