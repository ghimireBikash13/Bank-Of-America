package com.cubic.clientmain;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestClientCode {

	public static void getAccountInfo() {
		final String url = "http://localhost:8080/Accounts/account/boa";
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		ResponseEntity<String> accounts = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity(headers),
				String.class);
		System.out.println(accounts.getBody());

	}

}
