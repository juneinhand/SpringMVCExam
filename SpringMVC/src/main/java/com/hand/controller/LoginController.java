package com.hand.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


import com.hand.pojo.Customer;
import com.hand.service.CustomerService;

@Controller
@RequestMapping("/hello")
@Scope("prototype")
public class LoginController {
	@Autowired
	CustomerService customerService;

	@RequestMapping("/login")
	public String helloMvc() {

		return "hello";
	}

	@RequestMapping("/checkLogin")
	public String checkLogin(Customer customer, HttpServletRequest request) {
		// 调用login方法来验证是否是注册用户

		boolean loginType = customerService.login(customer.getFirstName());
		if (loginType) {
			// 如果验证通过,则将用户信息传到前台
			request.setAttribute("customer", customer);
			// 并跳转到success.jsp页面
			return "index";
		} else {
			// 若不对,则将错误信息显示到错误页面
			request.setAttribute("message","用户名密码错误");
			return "hello";
		}
	}
}
