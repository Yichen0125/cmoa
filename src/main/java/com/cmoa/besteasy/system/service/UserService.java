package com.cmoa.besteasy.system.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cmoa.besteasy.entities.Role;
import com.cmoa.besteasy.entities.User;
import com.cmoa.besteasy.mappers.RoleMapper;
import com.cmoa.besteasy.mappers.UserMapper;
import com.cmoa.besteasy.orm.PropertyFilter;
import com.cmoa.besteasy.util.Constants;
import com.cmoa.besteasy.util.DataUtils;
import com.github.pagehelper.PageHelper;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private RoleMapper roleMapper;

	@Transactional(readOnly = true)
	public User getByUserName(String username) {
		return userMapper.getByName(username);
	}

	@Transactional(readOnly = true)
	public User login(String name, String password) {
		User user = userMapper.getByName(name);

		if (user != null && user.getEnabled() == 1 && user.getPassword().equals(password)) {
			return user;
		}

		return null;
	}
	@Transactional
	public User saveUser(User user) {
		String newpwd = DataUtils.md5(user.getPassword(),user.getSalt());
		user.setPassword(newpwd);
		userMapper.saveUser(user);
		
		User user2 = getByUserName(user.getName());
		return user2;
	}

	public User getUserById(Integer id) {
		return userMapper.getUserById(id);
	}

	public void updateUser(User user) {
		if (user.getPassword() != "" && user.getPassword() != null){
			String newpwd = DataUtils.md5(user.getPassword(),user.getSalt());
			user.setPassword(newpwd);
			Role role = roleMapper.getRoleByName(user.getRole().getName());
			user.setRole(role);
		}else{
			Integer id = user.getId();
			System.out.println(id);
			User user2 = userMapper.getUserById(id);
			
			String pwd = user2.getPassword();
			user.setPassword(pwd);
			Role role = roleMapper.getRoleByName(user.getRole().getName());
			user.setRole(role);
		}
		userMapper.updateUser(user);
	}

	public void deleteUser(Integer id) {

		userMapper.deleteUser(id);
	}

//pageHelper
	public List<User> getAllUser() {
		return userMapper.getAllUser();
	}

	public List<User> getUserList(Integer pageNo, Map<String, Object> params) {
		List<PropertyFilter> filters = DataUtils.parseHandlerParamsToPropertyFilters(params);
		Map<String, Object> myBatisParmas = DataUtils.parsePropertyFiltersToMyBatisParmas(filters);
		
		PageHelper.startPage(pageNo, Constants.midelPageSize);
		System.out.println(myBatisParmas);
		List<User> userList = userMapper.getUserList(myBatisParmas);
		
		
		return userList;
	}

	public List<String> getUserNameList() {
		return userMapper.getUserNameList();
	}

}
