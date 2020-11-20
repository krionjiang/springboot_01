package com.jlq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ：jlq
 * @date ：Created in 2020/11/20 19:59
 */

/**
 * Controller类所在的包，一定要在主程序子包下
 */
@RestController    //@RequestBody @Controller
public class UserController {

    @RequestMapping("list")
    public String list(){
        return "hello spring boot";
    }

    @RequestMapping("map")
    public Map<String,Object> map(){
        Map<String,Object> map = new HashMap<>();
        map.put("code",200);
        map.put("data","hello world");
        map.put("time",new Date());
        return map;
    }
}


