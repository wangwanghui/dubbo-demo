package com.example.consumer.service;

import com.example.consumer.entity.OrderDO;

public interface OrderService {
    int addNewOrder(Integer orderId);

    int getRemainStock(Integer orderId);

    int schuduleValue();
}
