package com.cmoa.besteasy.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SqlContants {
	private static SimpleDateFormat format = null;
	public static Integer getAge(Date oldDate){
		format = new SimpleDateFormat("yyyy");
		String now = format.format(new Date());
		String old = format.format(oldDate);
		Integer age = Integer.parseInt(now) - Integer.parseInt(old);
		return age;
	}
	public static String getEntryTime(Date entryTime){
		format = new SimpleDateFormat("yyyy-MM-dd");
		String entryTimeStr = format.format(entryTime);
		return entryTimeStr;
	}
}
