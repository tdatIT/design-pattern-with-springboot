package com.patternapp.state.service;

import com.patternapp.state.model.Order;

public interface OrderService {
    Order handleOrderState(Order order);

    Order findOrderByNo(Integer no);
}
