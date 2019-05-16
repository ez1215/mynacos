package com.mynacos.myconsumer.controller;


import com.mynacos.myconsumer.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class IndexController {

    @Autowired
    private ProviderService providerService;

    @RequestMapping(value = "/feign",method = RequestMethod.GET)
    public String hello(String name){
        return providerService.hello(name);
    }
}
