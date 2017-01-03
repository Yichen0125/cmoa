package com.cmoa.besteasy.yx.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmoa.besteasy.entities.Cuscontact;
import com.cmoa.besteasy.mappers.CuscontactMapper;
import com.cmoa.besteasy.orm.PropertyFilter;
import com.cmoa.besteasy.util.Constants;
import com.cmoa.besteasy.util.DataUtils;
import com.github.pagehelper.PageHelper;

@Service
public class ContactService {
	
	@Autowired
	private CuscontactMapper cuscontactMapper;

	public List<Cuscontact> getContactList(Integer pageNo, Map<String, Object> params) {
		List<PropertyFilter> filters = DataUtils.parseHandlerParamsToPropertyFilters(params);
		Map<String, Object> myBatisParmas = DataUtils.parsePropertyFiltersToMyBatisParmas(filters);
		
		PageHelper.startPage(pageNo, Constants.minPageSize);
		List<Cuscontact> list = cuscontactMapper.selectPage(myBatisParmas);
		return list;
	}

}
