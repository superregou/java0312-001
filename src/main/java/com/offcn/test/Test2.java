package com.offcn.test;

import com.offcn.phone.MobileCodeWS;
import com.offcn.phone.MobileCodeWSSoap;

public class Test2 {

	public static void main(String[] args) {
		//创建服务视图
		MobileCodeWS mobilecodews = new MobileCodeWS();
		//获取服务实现类
		MobileCodeWSSoap mobilecodewssoap = mobilecodews.getPort(MobileCodeWSSoap.class);
		//调用查询方法
		String result = mobilecodewssoap.getMobileCodeInfo("15835920901", null);
		System.out.println(result);
	}

}
