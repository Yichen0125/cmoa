package com.cmoa.besteasy.yx.handler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerModel {
	protected static Map<Integer, String> cusStatus = new HashMap<Integer, String>();
	protected static Map<Integer, String> cusType = new HashMap<Integer, String>();
	protected static Map<Integer, String> cusNature = new HashMap<Integer, String>();
	protected static Map<Integer, String> isapproval = new HashMap<Integer, String>();
	protected static Map<Integer, String> level = new HashMap<Integer, String>();
	protected static Map<Integer, String> position = new HashMap<Integer, String>();
	protected static Map<Integer, String> stage = new HashMap<Integer, String>();
	protected static Map<Integer, String> myd = new HashMap<Integer, String>();
	protected static Map<Integer, String> xyd = new HashMap<Integer, String>();
	protected static Map<Integer, String> source = new HashMap<Integer, String>();
	protected static List<String>  bank = new ArrayList<String>();
	static {
		cusStatus.put(1, "正常 ");
		cusStatus.put(2, "警告 ");
		cusStatus.put(3, "暂缓流失 ");
		cusStatus.put(4, "流失");
		
		cusType.put(0, "营销中客户");
		cusType.put(1, "长期客户");
		cusType.put(2, "临时客户");
		
		cusNature.put(1, "国企");
		cusNature.put(2, "股份公司");
		cusNature.put(3, "责任公司");
		cusNature.put(4, "独资");
		cusNature.put(5, "联营");
		
		isapproval.put(1, "已审批");
		isapproval.put(0, "未审批");
		
		level.put(1, "A级用户");
		level.put(2, "B级用户");
		level.put(3, "C级用户");
		level.put(4, "D级用户");
		
		bank.add("中国银行");
		bank.add("邮政银行");
		bank.add("建设银行");
		bank.add("农业银行");
		bank.add("工商银行");
		
		position.put(1, "独家");
		position.put(2, "优势共享");
		position.put(3, "劣势共享");
		position.put(4, "零");
		
		stage.put(1, "5%线索");
		stage.put(2, "25%立项");
		stage.put(3, "50%认可");
		stage.put(4, "75%协议");
		stage.put(5, "90%下单");
		
		myd.put(1, "20");
		myd.put(2, "40");
		myd.put(3, "60");
		myd.put(4, "80");
		myd.put(5, "100");
		
		xyd.put(1, "20");
		xyd.put(2, "40");
		xyd.put(3, "60");
		xyd.put(4, "80");
		xyd.put(5, "100");
		
		source.put(1, "转介绍");
		source.put(2, "网络渠道");
		source.put(3, "预约上门");
		source.put(4, "陌拜");
		source.put(5, "公司资源");
		source.put(6, "展会资源");
		source.put(7, "个人资源");
		source.put(8, "电话咨询");
		source.put(9, "邮件咨询");

	}
}
