package com.cmoa.besteasy.yx.handler;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.WebUtils;

import com.cmoa.besteasy.util.DataUtils;
import com.cmoa.besteasy.yx.service.OrderService;
import com.github.pagehelper.PageInfo;
@RequestMapping("/yx/order")
@Controller
public class OrderHandler {
	@Autowired
	private OrderService orderService;
	/**
	 * 
	 * @param request
	 * @param map
	 * @param pageNo
	 * @return
	 * 2016年12月28日 下午5:55:04
	 * Administrator
	 */
	/*@RequestMapping("/list")
	public String showList(HttpServletRequest request,Map <String ,Object> map,
			@RequestParam(value = "pageNo" ,defaultValue="1" ,required=false) Integer pageNo){
		Map<String, Object> params = WebUtils.getParametersStartingWith(request, "search_");
		String queryString = DataUtils.encodeParamsToQueryString(params);
		request.setAttribute("queryString", queryString);
		
		List <Order> orderList = orderService.getOrderList(pageNo,params);
		
		PageInfo<Order > pageInfo = new PageInfo<Order>(orderList);
		map.put("orderList",orderList);
		map.put("pageInfo",pageInfo);
		map.put("totalElements",pageInfo.getTotal());
		return "yx/order/list";
	}*/
	
}
