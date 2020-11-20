package com.jlq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {

    @RequestMapping("hello")
    public String hello(Model model){
        model.addAttribute("name", "小明");
        return "hello";
    }
}
