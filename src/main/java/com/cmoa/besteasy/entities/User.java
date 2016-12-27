package com.cmoa.besteasy.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = Long.MAX_VALUE;
	private Integer id;
	private String name;
	private String password;
	private int enabled;
	// 盐值, 进行密码加密
	private String salt;
	// 该用户拥有的角色
	private Role role;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", enabled=" + enabled + ", salt=" + salt + ", role="
				+ role + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Collection<String> getRoleList() {
		Collection<String> roles = new ArrayList<String>();

		if (role != null) {
			for (Authority authority : role.getAuthorities()) {
				roles.add(authority.getName());
			}
		}

		return roles;
	}
}
