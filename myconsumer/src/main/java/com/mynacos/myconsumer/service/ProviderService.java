package com.mynacos.myconsumer.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "provider")
public interface ProviderService {

    @RequestMapping(value = "hello/{name}",method = RequestMethod.GET)
    String hello(@PathVariable("name") String name);

    @RequestMapping(value = "order/list",method = RequestMethod.GET)
    String list(@RequestParam("pageNum") Integer pageNum,@RequestParam("pageSize") Integer pageSize);
}
