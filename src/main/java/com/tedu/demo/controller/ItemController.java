package com.tedu.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    @RequestMapping("/first")
    public String fist(){
     return "你好，springboot";
    }
}
