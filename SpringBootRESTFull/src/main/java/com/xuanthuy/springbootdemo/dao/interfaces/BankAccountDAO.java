package com.xuanthuy.springbootdemo.dao.interfaces;

import java.util.List;

import com.xuanthuy.springbootdemo.entity.*;

public interface BankAccountDAO {
	List<BankAccount> getAll();
	BankAccount findById(Long id);
	void insert(BankAccount account);
	void update(BankAccount account);
	void delete(BankAccount account);
}
