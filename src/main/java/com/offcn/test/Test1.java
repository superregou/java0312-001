package com.offcn.test;

import com.offcn.Server;
import com.offcn.ServerService;

public class Test1 {

	public static void main(String[] args) {
		Server server = new ServerService().getServerPort();
		String name = server.getValue("Ð¡ºì");
		System.out.println("name:"+name);

	}

}
