package com.cmoa.besteasy.yx.handler;

import java.util.HashMap;
import java.util.Map;

public class OrderModel {
	protected static Map<Integer, String> ordType = new HashMap<Integer, String>();
	static{
		ordType.put(1, "笔译");
		ordType.put(2, "口译");
		ordType.put(3, "劳务派遣");
		ordType.put(4, "影视译制");
	}
}
