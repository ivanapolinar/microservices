package com.ivra.ordersservice.repositories;

import com.ivra.ordersservice.model.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
