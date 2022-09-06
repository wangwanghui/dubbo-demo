package com.example.consumer.dao;

import com.example.consumer.entity.OrderDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderMapper {
    int addNewOrder(OrderDO orderDO);
}
