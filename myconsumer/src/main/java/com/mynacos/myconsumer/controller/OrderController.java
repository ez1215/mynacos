package com.mynacos.myconsumer.controller;


import com.mynacos.myconsumer.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/con")
public class OrderController {

    @Autowired
    private ProviderService orderService;

    @GetMapping("/list")
    public Object list(){
        return orderService.list(1,10);
    }
}
