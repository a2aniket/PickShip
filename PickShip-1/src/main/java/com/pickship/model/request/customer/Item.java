package com.pickship.model.request.customer;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class Item
{

    private String itemName;
    private String itemId;
    private int quantity;
    private double price; // price is quantity * unitPrice

    public Item()
    {
    }

    @JsonCreator
    public Item(@JsonProperty("itemName") String itemName, @JsonProperty("itemId") String itemId,
	    @JsonProperty("quantity") int quantity, @JsonProperty("price") double price)
    {
	this.itemName = itemName;
	this.itemId = itemId;
	this.quantity = quantity;
	this.price = price;
    }

    public double getPrice()
    {
	return price;
    }

}
