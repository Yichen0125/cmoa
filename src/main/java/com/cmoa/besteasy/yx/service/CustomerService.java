package com.cmoa.besteasy.yx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmoa.besteasy.entities.Customer;
import com.cmoa.besteasy.mappers.CustomerMapper;
import com.cmoa.besteasy.util.Constants;
import com.github.pagehelper.PageHelper;

@Service
public class CustomerService {
	@Autowired
	private CustomerMapper customerMapper;
	
	public List<Customer> getCusList(Integer pageNo) {
		PageHelper.startPage(pageNo, Constants.minPageSize);
		List<Customer> list = customerMapper.selectAll();
		return list;
	}
	
	
	
}
