package com.example.provide.dao;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface StockMapper {
    int updateStockByProId(int id);

    int getRemainStock(int id);
}
