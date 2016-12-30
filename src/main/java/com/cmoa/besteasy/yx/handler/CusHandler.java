package com.cmoa.besteasy.yx.handler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.WebUtils;

import com.cmoa.besteasy.entities.Customer;
import com.cmoa.besteasy.entities.Employe;
import com.cmoa.besteasy.entities.Role;
import com.cmoa.besteasy.entities.User;
import com.cmoa.besteasy.system.service.EmpService;
import com.cmoa.besteasy.system.service.RoleService;
import com.cmoa.besteasy.util.DataUtils;
import com.cmoa.besteasy.yx.service.CustomerService;
import com.github.pagehelper.PageInfo;
@RequestMapping("/yx/customer")
@Controller
public class CusHandler extends CustomerModel{
	@Autowired
	private CustomerService customerService ;
	@Autowired
	private EmpService empService ;
	@Autowired
	private RoleService roleService;
	
	@RequestMapping("/update")
	public String update (Customer customer){
		customerService.updateCus(customer);
		return "redirect:list";
	}
	
	@RequestMapping("/toEditUI/{id}")
	public String toEditUI (@PathVariable("id") Integer id,Map<String ,Object> map,HttpSession session){
		Customer customer = customerService.getCusById(id);
		List<Employe> empList = empService.selectAll();
		User user = (User) session.getAttribute("user");
		
		List<Role> roleList = roleService.getHasRoleList();
		//判断权限列表是否包含当前用户  -- 
		if (roleList != null && roleList.size() != 0){
			
		for (int i = 0; i < roleList.size(); i++) {
			if (roleList.get(i).getName().equals(user.getRole().getName())){
				Map<Integer ,Object> usermap = new HashMap<Integer, Object>();
				usermap.put(user.getId(), user.getName());
				map.put("approval",usermap);
				map.put("level", level);
			}
		}
		}
		map.put("customer", customer);
		map.put("empList",empList);
		map.put("cusType",cusType);
		map.put("isapproval", isapproval);
		map.put("cusNature",cusNature);
		
		map.put("bank",bank);
		map.put("position",position);
		map.put("stage", stage);
		map.put("myd", myd);
		map.put("xyd", xyd);
		map.put("cusStatus", cusStatus);
		map.put("source",source);
		return "yx/customer/input"; 
	}
	@ResponseBody
	@RequestMapping(value="/input/q/{id}",method=RequestMethod.GET)
	public Object q(@PathVariable ("id")Integer id){
		Employe emp = empService.getEmpById(id);
		return emp.getEmpNum();
	}
	
	@RequestMapping(value="/add" ,method=RequestMethod.POST)
	public String add(Customer customer,HttpSession session){
		System.out.println(customer);
		User user = (User) session.getAttribute("user");
		customerService.saveCus(customer,user);
		return "redirect:list";
	}
	
	@RequestMapping("/toAddUI")
	public String toAddUI(Map<String ,Object> map,HttpSession session){
		Customer customer = new Customer();
		List<Employe> empList = empService.selectAll();
		User user = (User) session.getAttribute("user");
		
		List<Role> roleList = roleService.getHasRoleList();
		//判断权限列表是否包含当前用户  -- 
		if (roleList != null && roleList.size() != 0){
			
		for (int i = 0; i < roleList.size(); i++) {
			if (roleList.get(i).getName().equals(user.getRole().getName())){
				Map<Integer ,Object> usermap = new HashMap<Integer, Object>();
				usermap.put(user.getId(), user.getName());
				map.put("approval",usermap);
				map.put("level", level);
			}
		}
		}
		
		//行业
		//获取行业集合
		//map.put
		
		String cusNum = DataUtils.getUUID().substring(0, 15);
		map.put("cusNum", cusNum);
		
		map.put("customer", customer);
		map.put("empList",empList);
		map.put("cusType",cusType);
		map.put("isapproval", isapproval);
		map.put("cusNature",cusNature);
		
		map.put("bank",bank);
		map.put("position",position);
		map.put("stage", stage);
		map.put("myd", myd);
		map.put("xyd", xyd);
		map.put("cusStatus", cusStatus);
		map.put("source",source);
		return "yx/customer/input";
	}
	@RequestMapping("/list")
	public String showList(HttpServletRequest request,Map <String ,Object> map,
			@RequestParam(value = "pageNo" ,defaultValue="1" ,required=false) Integer pageNo){
		Map<String, Object> params = WebUtils.getParametersStartingWith(request, "search_");
		String queryString = DataUtils.encodeParamsToQueryString(params);
		request.setAttribute("queryString", queryString);
		List <Customer> cusList = customerService.getCusList(pageNo,params);
		
		PageInfo<Customer > pageInfo = new PageInfo<Customer>(cusList);
		map.put("cusList",cusList);
		map.put("pageInfo",pageInfo);
		map.put("totalElements",pageInfo.getTotal());
//		map.put("cusStatus", cusStatus);
		return "yx/customer/list";
	}
	
}
