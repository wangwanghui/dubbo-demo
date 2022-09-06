package com.example.consumer.controller;


import com.example.comon.Service.ProvideService;
import com.example.consumer.service.OrderService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ConsumerController {


    @Autowired
    private OrderService orderService;

    @RequestMapping("/B")
    public int getTest(@RequestParam("id") Integer orderId) {
        System.out.println("ready to do ---->  ");
        return orderService.addNewOrder(orderId);
    }


    @RequestMapping("/get")
    public int getValue(@RequestParam("id") Integer orderId) {
        System.out.println("getRemainStock to do ---->  ");
        return orderService.getRemainStock(orderId);
    }

}
