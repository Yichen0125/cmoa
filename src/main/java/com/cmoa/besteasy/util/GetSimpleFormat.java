package com.cmoa.besteasy.util;

import java.text.SimpleDateFormat;

public class GetSimpleFormat {
	public static SimpleDateFormat format = null;
	public static SimpleDateFormat getSimpleDateFormat(String pattern){
		if(format == null){
			synchronized (format.getClass()) {
				if (format == null){
					format = new SimpleDateFormat(pattern);
				}
			}
		}
		return format;
	}
}
