package com.customer.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.customer.api.domain.Address;

@FeignClient(name = "address-api")
public interface AddressServiceClient {
	
	@GetMapping("/address/customer/get/{customerId}")
	public Address getCustomerAddress(@PathVariable String customerId);

}
