package com.cmoa.besteasy.system.handler;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cmoa.besteasy.entities.Department;
import com.cmoa.besteasy.entities.User;
import com.cmoa.besteasy.system.service.DeptService;
import com.cmoa.besteasy.system.service.UserService;
import com.cmoa.besteasy.util.DataProcessUtils;
import com.cmoa.besteasy.util.DataUtils;
import com.cmoa.besteasy.util.SqlContants;
import com.github.pagehelper.PageInfo;
@RequestMapping("/system/group/dept")
@Controller
public class DeptHandler {
	@Autowired
	private DeptService deptService;
	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public String delete(@PathVariable("id") Integer id){
		Department d1 = deptService.getDeptById(id);
		d1.setDelflag(true);
		deptService.update(d1);
		return "1";
	}
	
	@RequestMapping("/update")
	public String update(Map<String,Object> map,Department dept){
		dept.setUpdateTime(new Date());
		deptService.update(dept);
		return "redirect:list";
	}
	
	@RequestMapping("/toEditUI/{id}")
	public String toEditUI(@PathVariable ("id") Integer id,Map<String,Object> map){
		Department dept = deptService.getDeptById(id);
		List<User> userList = userService.getAllUser();
		map.put("userList",userList);
		map.put("dept",dept);
		return "system/dept/edit";
	}
	
	@RequestMapping("/add")
	public String add(Department dept,HttpServletRequest request,Map<String,Object> map){
		String deptName = dept.getDeptName().trim();
		Integer count = deptService.getDeptByName(deptName);
		if (count == 0){
			dept.setCreateRDate(new Date());
			dept.setCreateTime(new Date());
			dept.setDelflag(false);
			dept.setId(null);
			
			dept.setOrdered((int)deptService.getTotal());
			dept.setUpdateTime(new Date());
			
			User user = userService.getByUserName(dept.getCreateUsername());
			dept.setCreateUser(user.getId());
			
			int result = deptService.saveDept(dept);
			if (result != 0){
//				request.setAttribute("message", "保存成功")
				map.put("message", "保存成功");
			}
			return "redirect:list";	
		}else{
			map.put("message", "保存失败");
			return "redirect:toAddUI";
		}
	}
	
	@RequestMapping("/toAddUI")
	public String toAddUI(Map<String ,Object> map){
		String deptNum = DataUtils.getUUID().substring(0, 4);
		
		List<User> userList = userService.getAllUser();
		
		map.put("deptNum", deptNum);
		map.put("userList", userList);
		return "system/dept/add";
	}
	
	@RequestMapping("/list")
	public String showList(Map <String ,Object> map){
		List <Department> deptList = deptService.getAllDept();
		map.put("deptList", deptList);
		
		long totalElements =  deptService.getTotal();
		map.put("totalElements", totalElements);
		return "system/dept/list";
	}
	
}
