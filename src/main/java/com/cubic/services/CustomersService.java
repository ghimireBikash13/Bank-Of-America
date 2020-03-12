package com.cubic.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.cubic.clientmain.RestClientCode;
import com.cubic.dtos.CustomersDto;

@Service
public class CustomersService {
	
	public CustomersDto getCustomerInfo() {

		CustomersDto cd = new CustomersDto();
		cd.setId(1);
		cd.setName("Bikash Ghimire");
		cd.setAddress("9335 lee highway");
		cd.setEmail("ghimire.bikash30@gmail.com");
		cd.setUuid(UUID.randomUUID().toString());
		RestClientCode.getAccountInfo();
		return cd;


	}

}
