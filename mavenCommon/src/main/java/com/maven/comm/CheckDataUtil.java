package com.maven.comm;

public class CheckDataUtil {
	
	
	/**
	 * 校验数据不为空
	 * 如果 校验结果 是空 返回 false
	 * 如果 校验结果 非空 返回 true
	 * FFF
	 * **/
	public static boolean checkNotEmpty(Object object) {
		boolean flag = false;
		if (object == null || "".equals(object.toString())) 
			return flag;
		return flag; 
	}

}
