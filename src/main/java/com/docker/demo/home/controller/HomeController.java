package com.docker.demo.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @ResponseBody
    @RequestMapping("/")
    public String showMain(){
        return "<h1>Hello,SB</h1>";
    }
}
