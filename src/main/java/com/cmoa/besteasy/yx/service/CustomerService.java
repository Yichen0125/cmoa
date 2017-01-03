package com.cmoa.besteasy.yx.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cmoa.besteasy.entities.Customer;
import com.cmoa.besteasy.entities.User;
import com.cmoa.besteasy.mappers.CustomerMapper;
import com.cmoa.besteasy.mappers.EmployeMapper;
import com.cmoa.besteasy.orm.PropertyFilter;
import com.cmoa.besteasy.util.Constants;
import com.cmoa.besteasy.util.DataUtils;
import com.github.pagehelper.PageHelper;

@Service
public class CustomerService {
	@Autowired
	private CustomerMapper customerMapper;
	@Autowired
	private EmployeMapper employeMapper;
	
	public List<Customer> getCusList(Integer pageNo,Map<String,Object> params) {
		List<PropertyFilter> filters = DataUtils.parseHandlerParamsToPropertyFilters(params);
		Map<String, Object> myBatisParmas = DataUtils.parsePropertyFiltersToMyBatisParmas(filters);
		
		PageHelper.startPage(pageNo, Constants.minPageSize);
		List<Customer> list = customerMapper.selectPage(myBatisParmas);
		return list;
	}

	public void saveCus(Customer customer,User user) {
		customer.setCreateRDate(new Date());
		customer.setCreateTime(new Date());
		customer.setCreateUser(user.getId());
		customer.setCreateUsername(user.getName());
		customer.setDepId(employeMapper.selectByPrimaryKey(customer.getEmpId()).getDeptId());
		customer.setDelflag(false);
		Integer level = customer.getLevel();
		if (level == null){
			customer.setLevel(3);
		}
		customerMapper.insert(customer);
	}

	public Customer getCusById(Integer id) {
		return customerMapper.selectByPrimaryKey(id);
	}
	@Transactional(readOnly = false)
	public void updateCus(Customer customer) {
		customer.setUpdateTime(new Date());
		customerMapper.updateByPrimaryKey(customer);
	}
	@Transactional(readOnly = false)
	public void deleteCus(Integer id) {
		Customer cus = customerMapper.selectByPrimaryKey(id);
		cus.setDelflag(true);
		cus.setUpdateTime(new Date());
		customerMapper.updateByPrimaryKey(cus);
	}

	public List<Customer> selectAll() {
		return customerMapper.selectAll();
	}
	
	
	
}
