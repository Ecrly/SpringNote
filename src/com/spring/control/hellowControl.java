package com.spring.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class hellowControl {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
