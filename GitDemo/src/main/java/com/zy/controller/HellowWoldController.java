package com.zy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowWoldController {
    @RequestMapping(value = "/hellow")
    public String hellow(){
        return "HellowWold";
    }
}
