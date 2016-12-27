package com.cmoa.besteasy.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cmoa.besteasy.entities.Department;
import com.cmoa.besteasy.mappers.DepartmentMapper;

@Service
public class DeptService {
	@Autowired
	private DepartmentMapper departmentMapper;
	
	@Transactional(readOnly=true)
	public List<Department> getAllDept() {
		return departmentMapper.selectAll();
	}
	@Transactional(readOnly=true)
	public long getTotal() {
		
		return departmentMapper.getTotal();
	}
	
	@Transactional(rollbackFor=Exception.class,readOnly=false)
	public int saveDept(Department dept) {
		int i = departmentMapper.insert(dept);
		return i;
	}
	@Transactional(readOnly=true)
	public int getDeptByName(String deptName) {
		
		return departmentMapper.getDeptByName(deptName);
	}
	@Transactional(readOnly=true)
	public Department getDeptById(Integer id) {
		return departmentMapper.selectByPrimaryKey(id);
	}
	@Transactional(rollbackFor=Exception.class,readOnly=false)
	public void update(Department dept) {
		departmentMapper.updateByPrimaryKey(dept);
	}

}
