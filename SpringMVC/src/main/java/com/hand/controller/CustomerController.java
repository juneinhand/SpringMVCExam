package com.hand.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.hand.pojo.Customer;
import com.hand.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Resource
	private CustomerService customerService;

/*	@RequestMapping("/showCustomer")
	public String toIndex(HttpServletRequest request) {
		List<Customer> list =customerService.getCustomer();
		
		for(Customer customer:list){
			request.setAttribute("customer",customer);
		}
		
		request.setAttribute("customer",customer);
		return "upload";
	}*/

	@RequestMapping(value = "/showCustomer", method = RequestMethod.GET)
	public @ResponseBody
	List<Customer> getCourseInJson() {
		return customerService.getCustomer();
	}
	/*
	@RequestMapping(value = "/jsontype/{customerId}", method = RequestMethod.GET)
	public ResponseEntity<Customer> getCourseInJson2(
			@PathVariable Short customerId) {
		Customer customer = customerService.getCustomerById(customerId);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	*/

	
	

}
