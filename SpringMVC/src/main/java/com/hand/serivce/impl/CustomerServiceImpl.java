package com.hand.serivce.impl;

import java.util.List;

import javax.annotation.Resource;



import org.springframework.stereotype.Service;

import com.hand.dao.CustomerDao;
import com.hand.pojo.Customer;
import com.hand.service.CustomerService;


@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Resource
	CustomerDao customerDao;

	@Override
	public Customer getCustomerById(Short customerId) {

		return this.customerDao.selectByPrimaryKey(customerId);
	}

	@Override
	public boolean login(String firstName) {

		// System.out.println("输入的账号:" + firstName);
		Customer customer = customerDao.selectByFirstName(firstName);
		if (customer != null) {

			if (customer.getFirstName().equals(firstName))
				return true;

		}

		return false;
	}

	@Override
	public List<Customer> getCustomer() {
	
		return this.customerDao.selectCustomer();
	}

	@Override
	public void addCustomer(Customer record) {
		// TODO Auto-generated method stub
		customerDao.insertSelective(record);
	}

/*	@Override
	public void addCustomer(Byte store_id,String firstName, String lastName, String email) {
		
		customerDao.insertCustomer(store_id,firstName, lastName, email);
		
	}*/

	
}
