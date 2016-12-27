package com.cmoa.besteasy.mappers;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cmoa.besteasy.entities.Role;

public interface RoleMapper {

	long getTotalElements();

	List<Role> getContent(@Param("fromIndex") int fromIndex, @Param("endIndex") int endIndex);

	void delete(Integer id);

	void create(Role role);

	Role getById(Integer id);

	List<Role> getAllList();

	void deleteRoleAuthorityById(Integer id);

	void saveRoleAuthority(HashMap<String, Object> params);

	List<Role> getRoleList();

	void updateEnabled(@Param("id") int id,@Param("enabled") boolean enabled);

	Role getRoleByName(String roleName);
}
