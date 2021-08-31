package com.example.demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class hgw {

    @RequestMapping("test")
    public String hellos(){
        return "hello word!";
    }



    @RequestMapping("he")
    public String hellosss(){
        return "痴心妄想！！！！！！！！！";
    }

}
