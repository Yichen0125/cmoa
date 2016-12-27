package com.cmoa.besteasy.yx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmoa.besteasy.entities.Order;
import com.cmoa.besteasy.mappers.OrderMapper;
import com.cmoa.besteasy.util.Constants;
import com.github.pagehelper.PageHelper;

@Service
public class OrderService {
@Autowired
	private OrderMapper orderMapper;
	
	public List<Order> getOrderList(Integer pageNo) {
		PageHelper.startPage(pageNo, Constants.minPageSize);
		List<Order> list = orderMapper.selectAll();
		return list;
	}
	
}
