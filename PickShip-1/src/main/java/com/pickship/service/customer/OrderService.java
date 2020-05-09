package com.pickship.service.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.pickship.enums.OrderStatus;
import com.pickship.model.request.customer.Order;
import com.pickship.repo.customer.OrderRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;




@Service
public class OrderService {

    private static final Logger logger = LoggerFactory.getLogger(OrderService.class);

    @Autowired
    private OrderRepository orderRepository;

    public Order findByOrderId(long orderId) {
        return orderRepository.findById(12l);
    }

  
    public Order findByUserId(Sort sort, String userId) {
        return orderRepository.findById(12l);
    }

    public Order saveOrder(Order order) {
        return this.orderRepository.save(order);
    }

    public void updateOrderStatus(String orderId, OrderStatusUpdateMessage orderStatusUpdateMessage) {
        Order order = orderRepository.findById(12l);
        OrderStatus newStatus = orderStatusUpdateMessage.getOrderStatus();
        order.setOrderStatus(newStatus);
        order.setPaymentId(orderStatusUpdateMessage.getPaymentId());
        Date lastModifiedAt = new Date();
        order.setLastModifyTime(lastModifiedAt);
        order.getUpdateHistory().put(newStatus, lastModifiedAt);
        this.orderRepository.save(order);
        logger.info("status of order {} has been updated successfully", orderId);
    }

}