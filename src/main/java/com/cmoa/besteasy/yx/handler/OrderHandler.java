package com.cmoa.besteasy.yx.handler;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.WebUtils;

import com.cmoa.besteasy.entities.Order;
import com.cmoa.besteasy.util.DataUtils;
import com.cmoa.besteasy.yx.service.OrderService;
import com.github.pagehelper.PageInfo;
@RequestMapping("/yx/order")
@Controller
public class OrderHandler extends OrderModel{
	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/toAddUI")
	public String toAddUI(Map <String ,Object> map){
		Order order = new Order();
		map.put("order", order);
		
		map.put("ordType",ordType);
		return "yx/order/input";
	}
	
	@RequestMapping("/list")
	public String showList(HttpServletRequest request,Map <String ,Object> map,
			@RequestParam(value = "pageNo" ,defaultValue="1" ,required=false) Integer pageNo){
		Map<String, Object> params = WebUtils.getParametersStartingWith(request, "search_");
		String queryString = DataUtils.encodeParamsToQueryString(params);
		request.setAttribute("queryString", queryString);
		
		List <Order> orderList = orderService.getOrderList(pageNo,params);
		
		PageInfo<Order> pageInfo = new PageInfo<Order>(orderList);
		map.put("orderList",orderList);
		map.put("pageInfo",pageInfo);
		map.put("totalElements",pageInfo.getTotal());
		return "yx/order/list";
	}
}
