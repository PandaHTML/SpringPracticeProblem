package com.krizhanovsky.SpringPractice.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class MyRestController {

    @RequestMapping(method = RequestMethod.GET, name = "/sayHello")
    public String sayHello(@RequestParam(value = "name",required = false,defaultValue = "World!") String name){
        return "Hello, " + name;
    }
}
