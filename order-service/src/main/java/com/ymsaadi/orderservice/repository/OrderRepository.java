package com.ymsaadi.orderservice.repository;

import com.ymsaadi.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
