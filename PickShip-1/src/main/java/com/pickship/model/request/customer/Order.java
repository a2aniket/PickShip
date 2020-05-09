package com.pickship.model.request.customer;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.pickship.enums.OrderStatus;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.math.BigDecimal;
import java.util.*;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "customer_order")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Order
{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String userId;
    private String paymentId;
    private OrderStatus orderStatus;
    @Transient
    private List<Item> items = new ArrayList<>();
    @Transient
    private DeliveryInfo deliveryInfo;
    private double totalCost;
    private String note;
    @CreatedDate
    private Date creationTime;
    @LastModifiedDate
    private Date lastModifyTime;
    @Transient
    private Map<OrderStatus, Date> updateHistory = new HashMap<>();

    public Order()
    {
    }

    @JsonCreator
    public Order(@JsonProperty("items") List<Item> items, @JsonProperty("deliveryInfo") DeliveryInfo deliveryInfo,
	    @JsonProperty("note") String note)
    {
	this.id = id;
	this.items = items;
	this.deliveryInfo = deliveryInfo;
	this.note = note;
	this.creationTime = new Date();
	this.totalCost = calculateTotalCost(this.items);
	this.orderStatus = OrderStatus.PENDING;
	this.updateHistory.put(this.orderStatus, this.creationTime);
    }

    private double calculateTotalCost(List<Item> items)
    {
	double cost = 0L;
	for (Item item : items)
	{
	    cost += item.getPrice() * 100;
	}
	return cost / 100.0;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String getPaymentId()
    {
        return paymentId;
    }

    public void setPaymentId(String paymentId)
    {
        this.paymentId = paymentId;
    }

    public OrderStatus getOrderStatus()
    {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus)
    {
        this.orderStatus = orderStatus;
    }

    public List<Item> getItems()
    {
        return items;
    }

    public void setItems(List<Item> items)
    {
        this.items = items;
    }

    public DeliveryInfo getDeliveryInfo()
    {
        return deliveryInfo;
    }

    public void setDeliveryInfo(DeliveryInfo deliveryInfo)
    {
        this.deliveryInfo = deliveryInfo;
    }

    public double getTotalCost()
    {
        return totalCost;
    }

    public void setTotalCost(double totalCost)
    {
        this.totalCost = totalCost;
    }

    public String getNote()
    {
        return note;
    }

    public void setNote(String note)
    {
        this.note = note;
    }

    public Date getCreationTime()
    {
        return creationTime;
    }

    public void setCreationTime(Date creationTime)
    {
        this.creationTime = creationTime;
    }

    public Date getLastModifyTime()
    {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime)
    {
        this.lastModifyTime = lastModifyTime;
    }

    public Map<OrderStatus, Date> getUpdateHistory()
    {
        return updateHistory;
    }

    public void setUpdateHistory(Map<OrderStatus, Date> updateHistory)
    {
        this.updateHistory = updateHistory;
    }

}
