package com.cmoa.besteasy.system.handler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cmoa.besteasy.entities.Authority;
import com.cmoa.besteasy.entities.Role;
import com.cmoa.besteasy.orm.Page;
import com.cmoa.besteasy.system.service.AuthorityService;
import com.cmoa.besteasy.system.service.RoleService;
import com.github.pagehelper.PageInfo;

@RequestMapping("/role")
@Controller
public class RoleHandler {

	@Autowired
	private RoleService roleService;

	@Autowired
	private AuthorityService authorityService;
	
	private static  Map<Integer,Object> params = new HashMap<Integer, Object>();
	
	{
		params.put(0, "无效");
		params.put(1, "有效");
	}
	
	@RequestMapping(value="/input",method=RequestMethod.GET)
	public String input(Map<String,Object> map){
		
		Role role = new Role();		
		map.put("enableds", params);
		map.put("role", role);
		
		return "role/input";
	}

	@RequestMapping(value = "/assign", method = RequestMethod.POST)
	public String update(@RequestParam(value = "pageNo", required = false, defaultValue = "1") Integer pageNo,
			@RequestParam("id") Integer id, @RequestParam("authorities2") List<String> authorities,@RequestParam("enabled") boolean enabled) {
		roleService.deleteRoleAuthorityById(id);
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("id", id);
		params.put("authorities", authorities);
		roleService.saveRoleAuthority(params);
		
		roleService.updateEnabled(id,enabled);
		
		return "redirect:/role/list?pageNo" + pageNo;
	}

	@RequestMapping(value = "/create")
	public String create(@RequestParam(value = "pageNo", required = false, defaultValue = "1") Integer pageNo,
			Role role) {
		roleService.create(role);
		return "redirect:/role/list?pageNo" + pageNo;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public String delete(@RequestParam("pageNo") Integer pageNo, @PathVariable("id") Integer id) {
		roleService.delete(id);
		return "redirect:/role/list?pageNo" + pageNo;
	}

	/*
	 * @RequestMapping(value="/assign/{id}") public String
	 * assign(@PathVariable("id") Integer id, Map<String, Object> map) {
	 * List<Authority> parentAuthorities = authorityService.getAll();
	 * map.put("parentAuthorities", parentAuthorities); Role role =
	 * roleService.getById(id); map.put("role", role); return "role/assign"; }
	 */

	@RequestMapping(value = "/assign/{id}", method = RequestMethod.GET)
	public String assignForm(@PathVariable("id") Integer id, Map<String, Object> map, ServletRequest request) {
		Role role = roleService.getById(id);
		map.put("role", role);
		List<Authority> list = authorityService.getAll();
		map.put("parentAuthorities", list);
		map.put("allStatus", params);
		return "/role/assign";
	}

	@RequestMapping("/list")
	public String list(@RequestParam(value = "pageNo", required = false) String pageNoStr, Map<String, Object> map) {
		int pageNo = 1;
		try {
			pageNo = Integer.parseInt(pageNoStr);
		} catch (NumberFormatException e) {
		}
		
	//	Page<Role> page = roleService.getPage(pageNo);
		List<Role> roleList= roleService.getRoleList(pageNo);
		PageInfo<Role> pageInfo = new PageInfo<Role>(roleList);
		map.put("roleList", roleList);
		map.put("pageInfo", pageInfo);
		return "role/list";
	}
}
