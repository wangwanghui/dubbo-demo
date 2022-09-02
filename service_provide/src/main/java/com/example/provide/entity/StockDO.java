package com.example.provide.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class StockDO {
    private String productName;

    private Integer stockNum;

    private LocalDateTime updateTime;

}
