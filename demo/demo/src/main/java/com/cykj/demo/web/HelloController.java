package com.cykj.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "my porjet";
    }

}
