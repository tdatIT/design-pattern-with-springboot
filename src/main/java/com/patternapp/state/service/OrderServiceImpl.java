package com.patternapp.state.service;

import com.patternapp.state.model.Order;
import com.patternapp.state.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepo orderRepo;

    @Override
    public Order handleOrderState(Order order) {

        switch (order.getState().getClass().getSimpleName()) {
            case "PendingState":
                order.setId(order.getState().handle());
                break;
            case "DeliveryState":
                order.setDelivery(order.getState().handle());
                break;
            case "CompleteState":
                order.setCompletedDate(new Date(Long.parseLong(order.getState().handle())));
                break;
        }
        return orderRepo.save(order);
    }

    @Override
    public Order findOrderByNo(Integer no) {
        return orderRepo.findOrderByNo(no);
    }
}
