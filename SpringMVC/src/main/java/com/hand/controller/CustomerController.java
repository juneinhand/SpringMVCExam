package com.hand.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.pojo.Customer;
import com.hand.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Resource
	private CustomerService customerService;

	@RequestMapping("/newCustomer")
	public String helloMvc() {

		return "newCustomer";
	}

	@RequestMapping(value = "/showCustomer", method = RequestMethod.GET)
	public @ResponseBody
	List<Customer> getCourseInJson() {
		return customerService.getCustomer();
	}

	/*
	 * @RequestMapping(value = "/jsontype/{customerId}", method =
	 * RequestMethod.GET) public ResponseEntity<Customer> getCourseInJson2(
	 * 
	 * @PathVariable Short customerId) { Customer customer =
	 * customerService.getCustomerById(customerId); return new
	 * ResponseEntity<Customer>(customer, HttpStatus.OK); }
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String doSave(@ModelAttribute Customer customer) {

		customer.setStoreId((byte) 1);
		customer.setAddressId((short) 12);
		customer.setCreateDate(new Date());
		customerService.addCustomer(customer);

		return "index";
	}

}
