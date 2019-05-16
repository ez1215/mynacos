package com.mynacos.myprovider.controller;


import com.mynacos.myprovider.model.Order;
import com.mynacos.myprovider.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Object list(Integer pageNum,Integer pageSize){
        if (null == pageNum || pageNum < 1)
            pageNum = 1;
        if (null == pageSize || pageSize < 1)
            pageSize = 10;

        List<Order> resultList = orderService.getByPage(pageNum,pageSize);
        return resultList;
    }
}
