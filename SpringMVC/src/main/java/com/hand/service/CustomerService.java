package com.hand.service;

import java.util.List;

import com.hand.pojo.Customer;

public interface CustomerService {
	public Customer getCustomerById(Short customerId);
	public List<Customer> getCustomer();
	public boolean login(String firstName);
	public void addCustomer(Customer record);
}
