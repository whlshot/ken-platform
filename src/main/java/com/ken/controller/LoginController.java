package com.ken.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yhq
 * @date 2019/7/26
 */
@RestController
@RequestMapping("/api")
public class LoginController {

    @PostMapping("/login")
    public String login(String userName, String password) {
        System.out.println(userName + " : " + password);
        return "success";
    }

}
