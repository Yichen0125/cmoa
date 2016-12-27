package com.cmoa.besteasy.yx.handler;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cmoa.besteasy.entities.Customer;
import com.cmoa.besteasy.entities.Order;
import com.cmoa.besteasy.yx.service.CustomerService;
import com.github.pagehelper.PageInfo;
@RequestMapping("/yx/customer")
@Controller
public class CusHandler {
	@Autowired
	private CustomerService customerService ;
	@RequestMapping("/toAddUI")
	public String toAddUI(){
		return "yx/customer/add";
	}
	
	
	
	@RequestMapping("/list")
	public String showList(HttpServletRequest request,Map <String ,Object> map,
			@RequestParam(value = "pageNo" ,defaultValue="1" ,required=false) Integer pageNo){
		List <Customer> cusList = customerService.getCusList(pageNo);
		
		PageInfo<Customer > pageInfo = new PageInfo<Customer>(cusList);
		map.put("cusList",cusList);
		map.put("pageInfo",pageInfo);
		map.put("totalElements",pageInfo.getTotal());
		return "yx/customer/list";
	}
	
}
