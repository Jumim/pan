package com.tang.pan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {

    @RequestMapping("/")
    public String mainView(){
        return "안녕!~";
    }
}
