package com.cmoa.besteasy.system.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cmoa.besteasy.entities.Role;
import com.cmoa.besteasy.mappers.RoleMapper;
import com.cmoa.besteasy.orm.Page;
import com.cmoa.besteasy.util.Constants;
import com.github.pagehelper.PageHelper;

@Service
public class RoleService {

	@Autowired
	private RoleMapper roleMapper;

	@Transactional
	public void delete(Integer id) {
		roleMapper.delete(id);
	}

	@Transactional
	public void create(Role role) {
		roleMapper.create(role);
	}

	@Transactional(readOnly = true)
	public Role getById(Integer id) {
		Role role = roleMapper.getById(id);
		return role;
	}

	public List<Role> getAllList() {
		return roleMapper.getAllList();
	}

	public void deleteRoleAuthorityById(Integer id) {
		roleMapper.deleteRoleAuthorityById(id);
	}
	@Transactional(rollbackFor=Exception.class,readOnly=false)
	public void saveRoleAuthority(HashMap<String, Object> params) {
		roleMapper.saveRoleAuthority(params);
	}

	public List<Role> getRoleList(int pageNo) {
		PageHelper.startPage(pageNo, Constants.minPageSize);
		List <Role> roleList = roleMapper.getRoleList();
		return roleList;
	}
	@Transactional(rollbackFor=Exception.class,readOnly=false)
	public void updateEnabled(Integer id, boolean enabled) {
		roleMapper.updateEnabled(id,enabled);
	}

	public Role getRoleByName(String roleName) {
		return roleMapper.getRoleByName(roleName);
	}
}
