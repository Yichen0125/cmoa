package com.cmoa.besteasy.system.handler;

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

import com.cmoa.besteasy.entities.Department;
import com.cmoa.besteasy.entities.Employe;
import com.cmoa.besteasy.entities.Role;
import com.cmoa.besteasy.entities.User;
import com.cmoa.besteasy.system.service.DeptService;
import com.cmoa.besteasy.system.service.EmpService;
import com.cmoa.besteasy.system.service.RoleService;
import com.cmoa.besteasy.system.service.UserService;
import com.cmoa.besteasy.util.DataUtils;
import com.github.pagehelper.PageInfo;
@RequestMapping("/system/group/emp")
@Controller
public class EmployeeHandler extends ModelParent{
	
	@Autowired
	private EmpService empService;
	@Autowired
	private DeptService deptService;
	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(Employe emp){
		empService.updateEmp(emp);
		return "redirect:list";
	}
	
	@RequestMapping(value="/delete/{id}")
	public String delete (@PathVariable("id") Integer id,@RequestParam("leavingReason") String leavingReason,@RequestParam("leavingTime") String leavingDate){
		empService.deleteEmp(id,leavingReason);
		return "redirect:/system/group/emp/list";
	}
	
//	toDeleteUI
	@RequestMapping(value="/toDeleteUI/{id}")
	public String toDelete (@PathVariable("id") Integer id,Map<String,Object> map){
		map.put("id", id);
		return "system/emp/delete";
	}
	
	@RequestMapping(value="/toEditUI/{id}")
	public String toEditUI(@PathVariable("id") Integer id,Map<String,Object> map){
		Employe emp = empService.getEmpById(id);
		List<Department> deptList = deptService.getAllDept();
		map.put("emp", emp);
		map.put("deptList", deptList);
		map.put("nations", nations);
		map.put("sex" ,sex);
		map.put("marriage", marriage);
		map.put("education", education);
		map.put("bank", bank);
		map.put("duties", duties);
		map.put("status", status);
		map.put("signed", signed);
		return "system/emp/edit";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(HttpSession session,Employe emp){
		User user = (User) session.getAttribute("TmpUser");
		String name = user.getRole().getName();
		Role role = roleService.getRoleByName(name);
		user.setRole(role);
		emp.setUserId(userService.saveUser(user).getId());
		emp.setDeptId(emp.getDept().getId());
		User nowUser = (User) session.getAttribute("user");
		emp.setCreateUser(nowUser.getId());
		emp.setCreateUsername(nowUser.getName());
		empService.saveEmp(emp);
		session.removeAttribute("TmpUser");
		return "redirect:list";
	}
	
	@RequestMapping(value="/toEmpAddUI",method=RequestMethod.POST)
	public String toEmpAddUI(HttpSession session ,Map<String ,Object> map,User user){
		user.setSalt(DataUtils.getUUID().substring(0, 10));
		session.setAttribute("TmpUser", user);
		//员工编号
		String empNum = DataUtils.getUUID().substring(0,4);
		
		List<Department> deptList = deptService.getAllDept();
		map.put("deptList", deptList);
		map.put("empNum", empNum);
		map.put("nations" ,nations);
	
		return "system/emp/input";
	}
	
	@RequestMapping("/toUserAddUI")
	public String toUserAddUI(HttpServletRequest request ,Map<String ,Object> map){
		request.setAttribute("token", "token");
		List<Role> roles = roleService.getAllList();
		map.put("roles", roles);
		User user = new User();
		
		map.put("user", user);
		
		map.put("allStatus", allStatus);
		return "user/input";
	}
	
	@RequestMapping("/list")
	public String showList(@RequestParam(value = "pageNo", required = false, defaultValue = "1") Integer pageNo,
			HttpServletRequest request,Map <String ,Object> map){
		Map<String, Object> params = WebUtils.getParametersStartingWith(request, "search_");
		String queryString = DataUtils.encodeParamsToQueryString(params);
		request.setAttribute("queryString", queryString);
		
		List<Department> deptList = deptService.getAllDept();
		
		List <Employe> empList = empService.getAllEmp(pageNo,params);
		PageInfo<Employe> pageInfo = new PageInfo<Employe>(empList);
		map.put("empList", empList);
		map.put("totalElements", pageInfo.getTotal());
		map.put("pageInfo",pageInfo);
		map.put("deptList", deptList);
		return "system/emp/list";
	}
	
}
