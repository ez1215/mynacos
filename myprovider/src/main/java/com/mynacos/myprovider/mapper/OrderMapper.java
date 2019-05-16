package com.mynacos.myprovider.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.mynacos.myprovider.model.Order;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author cgf
 * @since 2019-05-15
 */
public interface OrderMapper extends BaseMapper<Order> {

    List<Order> getByPage(Integer num,Integer size);
}
