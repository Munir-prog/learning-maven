package com.mprog;

import com.mprog.service.UserService;

public class AppRunner {
    public static void main(String[] args) {
        var userService = new UserService();
        System.out.println("Hello World " + userService.getUser(25L));
    }
}
