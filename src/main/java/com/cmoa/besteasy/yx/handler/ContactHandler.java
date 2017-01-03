package com.cmoa.besteasy.yx.handler;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.WebUtils;

import com.cmoa.besteasy.entities.Cuscontact;
import com.cmoa.besteasy.entities.Customer;
import com.cmoa.besteasy.util.DataUtils;
import com.cmoa.besteasy.yx.service.ContactService;
import com.cmoa.besteasy.yx.service.CustomerService;
import com.github.pagehelper.PageInfo;
@RequestMapping("/yx/contact")
@Controller
public class ContactHandler extends ContactModel{
	@Autowired
	private ContactService contactService;
	@Autowired
	private CustomerService customerService;
	@RequestMapping("/add")
	public String add (Cuscontact contact){
		System.out.println(contact);
		return "";
	}
	
	/**
	 * 跳转到添加页面
	 * 2017年1月3日 下午5:01:58
	 * S. Yichen
	 */
	@RequestMapping("/toAddUI")
	public String toAdd(Map<String,Object> map){
		Cuscontact contact = new Cuscontact();
		List<Customer> customerList = customerService.selectAll();
		
		map.put("customerList", customerList);
		map.put("contact",contact);
		map.put("sex", sex);
		map.put("primary", primary);
		map.put("ccCgljs", ccCgljs);
		map.put("ccFylx", ccFylx);
		map.put("ccJczyd", ccJczyd);
		map.put("ccXqfl", ccXqfl);
		map.put("ccFgzcdms", ccFgzcdms);
		return "yx/contact/input";
	}
	
	/**
	 * 联系人列表
	 * 2017年1月3日 下午5:01:41
	 * S. Yichen
	 */
	@RequestMapping("/list")
	public String showList(HttpServletRequest request,Map <String ,Object> map,
			@RequestParam(value = "pageNo" ,defaultValue="1" ,required=false) Integer pageNo){
		Map<String, Object> params = WebUtils.getParametersStartingWith(request, "search_");
		String queryString = DataUtils.encodeParamsToQueryString(params);
		request.setAttribute("queryString", queryString);
		List <Cuscontact> contactList = contactService.getContactList(pageNo,params);
		
		PageInfo<Cuscontact > pageInfo = new PageInfo<Cuscontact>(contactList);
		
		map.put("pageInfo", pageInfo);
		map.put("totalElements", pageInfo.getTotal());
		map.put("contactList", contactList);
		return "yx/contact/list";
	}
}
