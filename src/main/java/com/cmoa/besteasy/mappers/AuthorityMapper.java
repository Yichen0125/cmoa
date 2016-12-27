package com.cmoa.besteasy.mappers;

import java.util.List;

import com.cmoa.besteasy.entities.Authority;

public interface AuthorityMapper {

	List<Authority> getparents();

	List<Authority> getSubAuthorities(Integer id);

}
