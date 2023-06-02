package com.patternapp.state.controller;

import com.patternapp.state.model.*;
import com.patternapp.state.service.OrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/state-pattern")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/create-order")
    public ResponseEntity<String> createNewOrder(@RequestBody OrderDTO dto) {
        Order order = modelMapper.map(dto, Order.class);
        //create pending state for order
        order.setState(new PendingState());
        int orderId = orderService.handleOrderState(order).getNo();
        return ResponseEntity.ok("Order was created successful No.: " + orderId);
    }

    @PatchMapping("/delivery-order")
    public ResponseEntity<UpdateResponse> deliveryOrder(@RequestParam Integer no) {
        Order order = orderService.findOrderByNo(no);
        //create pending state for order
        if (order != null) {
            order.setState(new DeliveryState());
            Order order_updated = orderService.handleOrderState(order);
            return ResponseEntity.ok(new UpdateResponse("Update delivery state success", order_updated));
        } else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new UpdateResponse("not found order", null));
    }

    @PatchMapping("/completed-order")
    public ResponseEntity<UpdateResponse> completedOrder(@RequestParam Integer no) {
        Order order = orderService.findOrderByNo(no);
        //create pending state for order
        if (order != null) {
            order.setState(new CompleteState());
            Order order_updated = orderService.handleOrderState(order);
            return ResponseEntity.ok(new UpdateResponse("Update completed state success", order_updated));
        } else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new UpdateResponse("not found order", null));
    }


}
