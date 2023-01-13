package com.wujiada.springboot3.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author Administrator
 */
@RestController  //表明是一个控制器
@RequestMapping("/user")  //根路径
public class UserController {

    @GetMapping("/login")
    public String login(){
        return "欢迎来到SpringBoot3.0时代！现在时间是："+ new Date();
    }
}
