package com.pickship.repo.customer;

import org.springframework.data.repository.CrudRepository;

import com.pickship.model.request.customer.Order;

import antlr.collections.List;

public interface OrderRepository extends CrudRepository<Order, Long>
{
    List findByLastName(String lastName);

    Order findById(long id);
}
