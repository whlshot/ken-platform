package com.ken.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yhq
 * @date 2019/7/26
 */
@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "success";
    }
}
