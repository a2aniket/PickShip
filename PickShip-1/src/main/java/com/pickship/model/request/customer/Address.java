package com.pickship.model.request.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address
{

    enum AddressType
    {
	DEILIVERING, BILLING
    }
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String address, city, state;
    private Integer zipcode;
    @Transient
    private AddressType addressType;

    public Address()
    {
    }

    public Address(String address, String city, String state, Integer zipcode)
    {
	this.address = address;
	this.city = city;
	this.state = state;
	this.zipcode = zipcode;
    }

}