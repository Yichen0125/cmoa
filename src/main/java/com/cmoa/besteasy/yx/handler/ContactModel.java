package com.cmoa.besteasy.yx.handler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContactModel {
	protected static Map<Integer, String> sex = new HashMap<Integer, String>();
	protected static Map<Integer, String>  primary = new HashMap<Integer, String>();
	protected static Map<Integer, String>  ccCgljs = new HashMap<Integer, String>();
	protected static Map<Integer, String>  ccFylx = new HashMap<Integer, String>();
	protected static Map<Integer, String>  ccJczyd = new HashMap<Integer, String>();
	protected static Map<Integer, String>  ccXqfl = new HashMap<Integer, String>();
	protected static Map<Integer, String>  ccFgzcdms = new HashMap<Integer, String>();
	
	static {
		
		primary.put(1, "首要");
		primary.put(2, "次要");
		
		sex.put(1, "男");
		sex.put(0, "女");

		ccCgljs.put(1, "EB最终决策者");
		ccCgljs.put(2, "TB技术决策者");
		ccCgljs.put(3, "UB最终用户");
		ccCgljs.put(4, "Caoch教练");
		
		ccFylx.put(1, "G优化");
		ccFylx.put(2, "EK保持");
		ccFylx.put(3, "T避险");
		ccFylx.put(4, "OC自负");
		
		ccJczyd.put(1,"高");
		ccJczyd.put(2,"中");
		ccJczyd.put(3,"低");
		
		ccXqfl.put(1, "个性更具有弹性");
		ccXqfl.put(2, "感到更安全");
		ccXqfl.put(3, "尊崇其表现,肯定质量");
		ccXqfl.put(4, "被视为领导者");
		ccXqfl.put(5, "提供无可替代的价值");
		ccXqfl.put(6, "还人情债");
		ccXqfl.put(7, "维持生活型态品味");
		ccXqfl.put(8, "更多自由挥洒空间");
		ccXqfl.put(9, "达成对他人的控制能者");
		ccXqfl.put(10, "更多休闲时间");
		ccXqfl.put(11, "保留既有职位");
		ccXqfl.put(12, "增进技能的发展");
		ccXqfl.put(13, "增加个人生产者");
		ccXqfl.put(14, "作为执行改变的工具或手段");
		ccXqfl.put(15, "被视为问题解决者");
		ccXqfl.put(16, "心灵鸡汤、带来新观念");
		ccXqfl.put(17, "维持权者");
		
		ccFgzcdms.put(1, "支持对手");
		ccFgzcdms.put(2, "抗拒建议");
		ccFgzcdms.put(3, "负面评价");
		ccFgzcdms.put(4, "不感兴趣");
		ccFgzcdms.put(5, "不抗拒");
		ccFgzcdms.put(6, "认知相同");
		ccFgzcdms.put(7, "有兴趣");
		ccFgzcdms.put(8, "支持");
		ccFgzcdms.put(9, "大力支持");
		ccFgzcdms.put(10, "热情拥护");
	}
}
