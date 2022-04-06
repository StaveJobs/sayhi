package com.open.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 小迪
 * @CreateTime 2022/4/6-周三 14:16
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHi() {
        return "OK,Service ok. It's OK.";
    }
}
