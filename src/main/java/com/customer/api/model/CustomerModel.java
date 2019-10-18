package com.customer.api.model;

import com.customer.api.domain.Address;
import com.customer.api.domain.Customer;

public class CustomerModel {

	private Customer customer;
	private Address address;

	public CustomerModel() {
	}

	public CustomerModel(Customer customer, Address address) {
		super();
		this.customer = customer;
		this.address = address;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
