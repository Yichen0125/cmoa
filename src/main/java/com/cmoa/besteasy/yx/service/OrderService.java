package com.cmoa.besteasy.yx.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import com.cmoa.besteasy.orm.PropertyFilter;
import com.cmoa.besteasy.util.Constants;
import com.cmoa.besteasy.util.DataUtils;
import com.github.pagehelper.PageHelper;

@Service
public class OrderService {
/*@Autowired
	private OrderMapper orderMapper;
	
	public List<Order> getOrderList(Integer pageNo,Map<String ,Object> params) {
		List<PropertyFilter> filters = DataUtils.parseHandlerParamsToPropertyFilters(params);
		Map<String, Object> myBatisParmas = DataUtils.parsePropertyFiltersToMyBatisParmas(filters);
		
		PageHelper.startPage(pageNo, Constants.minPageSize);
		List<Order> list = orderMapper.selectAll(myBatisParmas);
		return list;
	}*/
	
}
