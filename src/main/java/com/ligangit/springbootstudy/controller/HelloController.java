package com.ligangit.springbootstudy.controller;/*
 * @BelongsProject:spring-boot-study
 * @BelongsPackage:com.ligangit.springbootstudy.controller
 * @Author:com.ligangit.springbootstudy.controller
 * @CreateTime:2020-01-14 ${HORU}:47
 * @Descriptation:todo*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


//这个类的所有方法返回的数据直接写给浏览器
//@ResponseBody
//@Controller
@RestController
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World quick!";
    }
}
