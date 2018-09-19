package com.xuanthuy.springbootdemo;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class TestWithHeader {
	private static final String URL_BANKACCOUNT = "http://localhost:8080/bankaccount";
	private static final String URL_BANKACCOUNT_XML = "http://localhost:8080/bankaccount.xml";
	private static final String URL_BANKACCOUNT_JSON = "http://localhost:8080/bankaccount.json";

	
	
	public static void main(String[] args) {
		
		//HttpHeaders
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(new MediaType[] {MediaType.APPLICATION_JSON}));
		//Yêu cầu trả về định dạng JSON
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("my_other_key", "my_other_value");
		HttpEntity<String> entity = new HttpEntity<String>(headers); //HttpEntity<String>: Lấy kết quả như là String
		
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<String> response = restTemplate.exchange(URL_BANKACCOUNT, HttpMethod.GET,entity,String.class);
		String result = response.getBody();
		System.out.println(result);
	}
}
