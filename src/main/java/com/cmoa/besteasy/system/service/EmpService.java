package com.cmoa.besteasy.system.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cmoa.besteasy.entities.Employe;
import com.cmoa.besteasy.mappers.EmployeMapper;
import com.cmoa.besteasy.orm.PropertyFilter;
import com.cmoa.besteasy.util.Constants;
import com.cmoa.besteasy.util.DataUtils;
import com.cmoa.besteasy.util.SqlContants;
import com.github.pagehelper.PageHelper;

@Service
public class EmpService {
	@Autowired
	private EmployeMapper employeeMapper;

	public List<Employe> getAllEmp(Integer pageNo,Map <String, Object>params) {
		List<PropertyFilter> filters = DataUtils.parseHandlerParamsToPropertyFilters(params);
		Map<String, Object> myBatisParmas = DataUtils.parsePropertyFiltersToMyBatisParmas(filters);
		
		PageHelper.startPage(pageNo, Constants.midelPageSize);
		List<Employe> list = employeeMapper.selectPage(myBatisParmas);
		return list;
	}

	public void saveEmp(Employe emp) {
		Integer age = SqlContants.getAge(emp.getBirth());
		emp.setAge(age.byteValue());
		
		emp.setCreateTime(new Date());
		emp.setCreateRDate(new Date());
		emp.setDelflag(false);
		emp.setLeavingDate(new Date());
		//--
		emp.setOrdered(null);
		
		emp.setUpdateTime(new Date());
		employeeMapper.insert(emp);
	}
	@Transactional(readOnly=true)
	public Employe getEmpById(Integer id) {
		return employeeMapper.selectByPrimaryKey(id);
	}

	public void deleteEmp(Integer id,String leavingReason) {
		Employe employe = employeeMapper.selectByPrimaryKey(id);
		employe.setDelflag(true);
		employe.setLeavingDate(new Date());
		employe.setLeavingReason(leavingReason);
		employeeMapper.updateByPrimaryKey(employe);
	}

	public void updateEmp(Employe emp) {
		emp.setUpdateTime(new Date());
		employeeMapper.updateByPrimaryKey(emp);
	}
	
}
