package com.knoldus.user_service.service;

import com.knoldus.user_service.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //fake user list

    List<User> list = List.of(
            new User(1311L, "Deepak Kumar", "23525625"),
            new User(1312L, "Ankit Rajput", "99999"),
            new User(1314L, "Ravi Tiwari", "888")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}