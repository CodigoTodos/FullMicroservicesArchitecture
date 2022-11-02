package com.brunoalves.OrderService.service;

import com.brunoalves.OrderService.model.OrderRequest;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);
}
