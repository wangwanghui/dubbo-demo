package com.example.consumer.service.impl;

import com.example.comon.Service.ProvideService;
import com.example.consumer.dao.OrderMapper;
import com.example.consumer.entity.OrderDO;
import com.example.consumer.service.OrderService;
import io.seata.spring.annotation.GlobalLock;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
   @Autowired
   private OrderMapper orderMapper;

   @DubboReference
   private ProvideService provideService;

    @GlobalTransactional(rollbackFor = Exception.class)
    @Override
    public int addNewOrder(Integer orderId) {
        OrderDO orderDO = new OrderDO();
        orderDO.setOrderId(orderId);
        orderDO.setAmount(3180.8);
        orderDO.setQuantity(1);
        orderDO.setProductName("电脑");
        orderMapper.addNewOrder(orderDO);
        log.info("开始扣减库存");
        int result = provideService.reduceStock();
        log.info("远程调用结果 {} ",result);
        int a = 5/0;
        return result;
    }

    @GlobalLock(lockRetryInternal = 100, lockRetryTimes = 5)
    @Transactional
    @Override
    public int getRemainStock(Integer orderId) {
        return provideService.getRemainStock();
    }

    @Scheduled(cron = "*/5 * * * * ?")
    @Override
    public int schuduleValue() {
        System.out.println("定时拿取值");
        int result = provideService.getRemainStock();
        System.out.println(result);
        return 0;
    }


}
