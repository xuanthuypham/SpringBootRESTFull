package com.xuanthuy.springbootdemo.entity;
// Generated Sep 3, 2018 3:46:46 AM by Hibernate Tools 5.0.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * BankAccount generated by hbm2java
 */
@Entity
@Table(name = "bank_account", catalog = "bank")
public class BankAccount implements java.io.Serializable {

	private long id;
	private String fullName;
	private double balance;

	public BankAccount() {
	}

	public BankAccount(long id, String fullName, double balance) {
		this.id = id;
		this.fullName = fullName;
		this.balance = balance;
	}

	@Id

	@Column(name = "ID", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "FULL_NAME", nullable = false, length = 128)
	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Column(name = "BALANCE", nullable = false, precision = 22, scale = 0)
	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}