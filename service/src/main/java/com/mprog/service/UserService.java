package com.mprog.service;

import com.mprog.dao.UserDao;
import com.mprog.dto.UserDto;

import java.util.Optional;

public class UserService {
    UserDao userDao = new UserDao();
    public Optional<UserDto> getUser(Long id){
        return userDao.findById(id)
                .map(it -> new UserDto());
    }
}
