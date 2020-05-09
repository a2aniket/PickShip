package com.pickship.controller.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pickship.model.request.customer.Order;
import com.pickship.service.customer.OrderService;
import com.pickship.service.customer.OrderStatusUpdateMessage;

@RestController
@RequestMapping("/parcelseva/v1/order")
public class OrderController
{

    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    private static final String DEFAULT_ORDER_SORT_BY = "creationTime";
    private static final String DEFAULT_ORDER_SORT_DIR = "desc";

    private static final String REQUEST_TIMEOUT_RESPONSE = "Sorry, server is busy. Please try again later.";
    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/order/{orderId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Order findByOrderId(@PathVariable("orderId") String orderId)
    {
	return this.orderService.findByOrderId(12l);
    }

    @RequestMapping(value = "/{userId}/orders/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Order> findUserOrders(@PathVariable("userId") String userId)
    {
	return ResponseEntity
		.ok(this.orderService.findByOrderId(12l));
    }

    @RequestMapping(value = "/order", method = RequestMethod.POST)
    @ResponseBody
    public Order placeOrder(@RequestBody Order order)
    {
	return this.orderService.saveOrder(order);
    }

    @RequestMapping(value = "/order/{orderId}", method = RequestMethod.POST)
    public void updateOrderStatus(@PathVariable("orderId") String orderId,
	    @RequestBody OrderStatusUpdateMessage orderStatusUpdateMessage)
    {
	this.orderService.updateOrderStatus(orderId, orderStatusUpdateMessage);
    }

}