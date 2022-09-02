package com.example.consumer.entity;

import lombok.Data;

@Data
public class OrderDO {
    private String orderId;

    private Double amount;

    private Integer quantity;

    private String productName;
}
