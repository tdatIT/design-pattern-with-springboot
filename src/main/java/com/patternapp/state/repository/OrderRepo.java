package com.patternapp.state.repository;

import com.patternapp.state.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Integer> {
    Order findOrderByNo(int no);
}
