package com.mynacos.myconsumer.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "provider")
public interface ProviderService {

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "order/getOrderList",method = RequestMethod.GET)
    String getOrderList(@RequestParam("pageNum") Integer pageNum,@RequestParam("pageSize") Integer pageSize);
}
