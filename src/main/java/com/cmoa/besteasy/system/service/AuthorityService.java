package com.cmoa.besteasy.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cmoa.besteasy.entities.Authority;
import com.cmoa.besteasy.mappers.AuthorityMapper;

@Service
public class AuthorityService {

	@Autowired
	private AuthorityMapper authorityMapper;

	@Transactional(readOnly = true)
	public List<Authority> getAll() {
		List<Authority> authorities = authorityMapper.getparents();
		for (Authority authority : authorities) {
			Integer id = authority.getId();
			List<Authority> subAuthorities = authorityMapper.getSubAuthorities(id);
			authority.setSubAuthorities(subAuthorities);
		}
		return authorities;
	}
}
