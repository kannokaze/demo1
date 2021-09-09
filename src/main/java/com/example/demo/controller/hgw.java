package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@Api(value = "测试使用接口", description = "fdsafds ")
public class hgw {

    @ApiOperation(value = "测试接口", tags = {"test"}, notes = "接口必须使用GET方式请求", httpMethod = "POST")
    @RequestMapping("/api/test")
    public String hellos(@ApiParam(value = "填写任意字符", required = true, example = "林剑锋") String ge) {
        return "hello word!";
    }


    @RequestMapping("/api/he")
    public String hellosss() {
        return "痴心妄想！！！！！！！！！";
    }

}
