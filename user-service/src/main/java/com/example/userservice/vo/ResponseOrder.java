package com.example.userservice.vo;

import lombok.Data;

import java.util.Date;

@Data
public class ResponseOrder {
    private String productId;
    private String qty;
    private String unitPrice;
    private String totalPrice;
    private Date createdAt;

    private String orderId;
}
