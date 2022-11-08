package com.brunoalves.OrderService.service;

import com.brunoalves.OrderService.model.OrderRequest;
import com.brunoalves.OrderService.model.OrderResponse;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);
}
