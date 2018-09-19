package com.xuanthuy.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xuanthuy.springbootdemo.dao.interfaces.BankAccountDAO;
import com.xuanthuy.springbootdemo.entity.BankAccount;

@RestController
public class MainRestController {
	@Autowired
	private BankAccountDAO bankAccountDAO;
	
    // URL:
    // http://localhost:8080/SomeContextPath/employees
    // http://localhost:8080/SomeContextPath/employees.xml
    // http://localhost:8080/SomeContextPath/employees.json
	@GetMapping(value="/bankaccount",produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	@ResponseBody
	public List<BankAccount> getBankAccount(){
		return (List<BankAccount>) bankAccountDAO.getAll();
	}
	
    // URL:
    // http://localhost:8080/SomeContextPath/employee/{empNo}
    // http://localhost:8080/SomeContextPath/employee/{empNo}.xml
    // http://localhost:8080/SomeContextPath/employee/{empNo}.json
	@GetMapping(value = "/bankaccount/{bankNo}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public BankAccount findBankAccount(@PathVariable("bankNo") Long id) {
		return bankAccountDAO.findById(id);
	}
	
	@PostMapping(value = "/bankaccount", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public void addBankAccount(@RequestBody BankAccount account) {
		System.out.println("BankAccount id +++++++++++++++ "+account.getId());
		bankAccountDAO.insert(account);
	}
	
    // URL:
    // http://localhost:8080/SomeContextPath/bankaccount
    // http://localhost:8080/SomeContextPath/bankaccount.xml
    // http://localhost:8080/SomeContextPath/bankaccount.json
	@PutMapping(value = "/bankaccount", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public void updateBankAccount(@RequestBody BankAccount account) {
		System.out.println("Employee id update ++++++++++++++++ "+account.getId());
		bankAccountDAO.update(account);
	}
	
	@DeleteMapping(value="/bankaccount/{bankNo}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE } )
	@ResponseBody
	public void deleteBankAccount(@PathVariable("bankNo") Long id) {
		BankAccount account = bankAccountDAO.findById(id);
		bankAccountDAO.delete(account);
	}
}
