package com.example.provide.service;


import com.example.comon.Service.ProvideService;
import com.example.provide.dao.StockMapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

@DubboService
public class ProvideServiceImpl implements ProvideService {
    @Autowired
    private StockMapper stockMapper;


    @Override
    public String testProvide() {
        return "this is ProvideService  Dubbo demo";
    }

    //减少库存
    @Override
    public int reduceStock() {
        return stockMapper.updateStockByProId(1);
    }

    @Override
    public int getRemainStock() {
        return stockMapper.getRemainStock(1);
    }
}
