package com.xuanthuy.springbootdemo;

import org.springframework.web.client.RestTemplate;

public class Testhaha {
	
	private static final String URL_BANKACCOUNT = "http://localhost:8080/bankaccount";
	private static final String URL_BANKACCOUNT_XML = "http://localhost:8080/bankaccount.xml";
	private static final String URL_BANKACCOUNT_JSON = "http://localhost:8080/bankaccount.json";

	
	
	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(URL_BANKACCOUNT, String.class);
		System.out.println(result);
	}
}
