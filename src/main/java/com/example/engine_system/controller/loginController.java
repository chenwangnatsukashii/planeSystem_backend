package com.example.engine_system.controller;

import com.example.engine_system.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class loginController {
    @PostMapping("/login")
    public int login(@RequestBody User user) {
        return 1;
    }

    @PostMapping("/logout")
    public int logout() {
        return 1;
    }

    @GetMapping("/get_info")
    public User get_info() {
        return new User("", "",
                "https://file.iviewui.com/dist/a0e88e83800f138b94d2414621bd9704.png", "", "");
    }
}
