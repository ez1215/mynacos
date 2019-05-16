package com.mynacos.myprovider.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping(value = "hello/{name}",method = RequestMethod.GET)
    public String sayHello(@PathVariable("name") String name){
        if (StringUtils.isBlank(name))
            name = "guest";
        System.out.println(name);
        return "hello ," + name;
    }
}
