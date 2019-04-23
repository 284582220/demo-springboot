package com.yangguojun.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// 相当于@Controller + @ResponseBOdy
@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "hello world";
    }
}
