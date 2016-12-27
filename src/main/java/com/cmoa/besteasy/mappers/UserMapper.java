package com.cmoa.besteasy.mappers;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.cmoa.besteasy.entities.User;

public interface UserMapper {

	User getByName(@Param("name") String name);

	long getTotalElements(Map<String, Object> myBatisParmas);

	List<User> getContent(Map<String, Object> myBatisParmas);

	void saveUser(User user);

	User getUserById(@Param("id") Integer id);

	void updateUser(User user);

	void deleteUser(@Param("id") Integer id);
	//测试pageHelper
	List<User> getUserList(Map <String ,Object> params);

	List<User> getAllUser();
	
	List<String> getUserNameList();


}
