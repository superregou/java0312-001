package com.offcn.test;

import com.offcn.phone.MobileCodeWS;
import com.offcn.phone.MobileCodeWSSoap;

public class Test2 {

	public static void main(String[] args) {
		//����������ͼ
		MobileCodeWS mobilecodews = new MobileCodeWS();
		//��ȡ����ʵ����
		MobileCodeWSSoap mobilecodewssoap = mobilecodews.getPort(MobileCodeWSSoap.class);
		//���ò�ѯ����
		String result = mobilecodewssoap.getMobileCodeInfo("15835920901", null);
		System.out.println(result);
	}

}
