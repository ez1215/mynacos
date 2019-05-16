package com.mynacos.myprovider.service;

import com.baomidou.mybatisplus.service.IService;
import com.mynacos.myprovider.model.Order;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cgf
 * @since 2019-05-15
 */
public interface OrderService extends IService<Order> {

    List<Order> getByPage(Integer num, Integer size);
}
