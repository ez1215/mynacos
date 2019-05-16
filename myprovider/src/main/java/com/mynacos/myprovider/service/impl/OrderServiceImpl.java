package com.mynacos.myprovider.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.mynacos.myprovider.mapper.OrderMapper;
import com.mynacos.myprovider.model.Order;
import com.mynacos.myprovider.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cgf
 * @since 2019-05-15
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> getByPage(Integer num, Integer size) {
        return orderMapper.getByPage(num,size);
    }
}
