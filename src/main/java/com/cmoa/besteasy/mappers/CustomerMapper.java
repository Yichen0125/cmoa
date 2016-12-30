package com.cmoa.besteasy.mappers;

import java.util.List;
import java.util.Map;

import com.cmoa.besteasy.entities.Customer;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Customer record);

    Customer selectByPrimaryKey(Integer id);

    List<Customer> selectAll();

    int updateByPrimaryKey(Customer record);

	List<Customer> selectPage(Map<String, Object> myBatisParmas);
    
}