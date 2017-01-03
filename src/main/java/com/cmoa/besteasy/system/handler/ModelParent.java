package com.cmoa.besteasy.system.handler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModelParent {
	protected static Map<Integer, String> allStatus = new HashMap<Integer, String>();
	protected static Map<Integer, String> sex = new HashMap<Integer, String>();
	protected static List<String> nations = new ArrayList<String>();
	protected static Map<Integer, String> marriage = new HashMap<Integer, String>();
	protected static Map<Integer, String> education = new HashMap<Integer, String>();
	protected static List<String>  bank = new ArrayList<String>();
	protected static Map<Integer, String>  duties = new HashMap<Integer, String>();
	protected static Map<Integer, String>  status = new HashMap<Integer, String>();
	protected static Map<Integer, String>  signed = new HashMap<Integer, String>();
	
	static {
		allStatus.put(1, "有效");
		allStatus.put(0, "无效");
		
		sex.put(1, "男");
		sex.put(0, "女");
		
		marriage.put(1, "已婚");
		marriage.put(0, "未婚");
		
		education.put(1, "博士研究生");
		education.put(2, "硕士研究生");
		education.put(3, "本科毕业");
		education.put(4, "大学专科");
		
		bank.add("中国银行");
		bank.add("邮政银行");
		bank.add("建设银行");
		bank.add("农业银行");
		bank.add("工商银行");
		
		duties.put(1, "总经理");
		duties.put(2, "总监");
		duties.put(3, "经理");
		duties.put(4, "项目经理");
		duties.put(5, "职员");
		
		status.put(1, "在职");
		status.put(0, "离职") ;
		
		signed.put(1, "已签订");
		signed.put(0, "未签订");
		
		nations.add("汉族");
		nations.add("满族");
		nations.add("回族");
		nations.add("藏族");
		nations.add("蒙古族");
	}
}
