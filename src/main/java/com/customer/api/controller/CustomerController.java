package com.customer.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.api.client.AddressServiceClient;
import com.customer.api.domain.Address;
import com.customer.api.domain.Customer;
import com.customer.api.model.CustomerModel;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private AddressServiceClient addressServiceClient;
	
	@GetMapping("/get/{customerId}")
	public CustomerModel getCustomer(@PathVariable String customerId) {

		Customer customer = new Customer();
		customer.setCustomerId("CST10001");
		customer.setFirstName("Satheesh");
		customer.setLastName("Chepuri");
		
		Address address = addressServiceClient.getCustomerAddress(customerId);
		CustomerModel customerModel = new CustomerModel();
		customerModel.setCustomer(customer);
		customerModel.setAddress(address);

		return customerModel;

	}

}
