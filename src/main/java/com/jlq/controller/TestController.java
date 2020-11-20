package com.jlq.controller;

import com.jlq.domain.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("test")
    public @ResponseBody String test(){
        return "hello world";
    }

    @RequestMapping("show")
    public String show(Model model){
        UserInfo info = new UserInfo();
        info.setId(100);
        info.setName("小红");
        info.setAddress("中山");
        model.addAttribute("info", info);
        return "show";
    }
}
