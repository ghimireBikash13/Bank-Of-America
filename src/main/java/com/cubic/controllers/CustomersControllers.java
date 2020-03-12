package com.cubic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cubic.dtos.CustomersDto;
import com.cubic.services.CustomersService;

@RestController
@RequestMapping("/customers")
public class CustomersControllers {

	@Autowired
	private CustomersService customersService;

	@GetMapping(value="")
	public CustomersDto getCustomersdetails() {

		return customersService.getCustomerInfo();
	}

}
