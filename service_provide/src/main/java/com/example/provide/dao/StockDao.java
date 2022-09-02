package com.example.provide.dao;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface StockDao {
    int updateStockByProId(int id);

}
