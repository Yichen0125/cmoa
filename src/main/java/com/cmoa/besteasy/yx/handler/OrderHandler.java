package com.cmoa.besteasy.yx.handler;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cmoa.besteasy.entities.Order;
import com.cmoa.besteasy.yx.service.OrderService;
import com.github.pagehelper.PageInfo;
@RequestMapping("/yx/order")
@Controller
public class OrderHandler {
	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/list")
	public String showList(HttpServletRequest request,Map <String ,Object> map,
			@RequestParam(value = "pageNo" ,defaultValue="1" ,required=false) Integer pageNo){
		List <Order> orderList = orderService.getOrderList(pageNo);
		
		PageInfo<Order > pageInfo = new PageInfo<Order>(orderList);
		map.put("orderList",orderList);
		map.put("pageInfo",pageInfo);
		map.put("totalElements",pageInfo.getTotal());
		return "yx/order/list";
	}
	
}
