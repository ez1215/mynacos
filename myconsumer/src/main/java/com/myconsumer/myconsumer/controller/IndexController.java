package com.myconsumer.myconsumer.controller;


import com.myconsumer.myconsumer.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping(value = "/feign",method = RequestMethod.GET)
    public String hello(String name){
        System.out.println(name);
        return indexService.hello(name);
    }
}
