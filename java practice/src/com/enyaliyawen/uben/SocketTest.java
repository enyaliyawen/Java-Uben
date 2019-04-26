package com.enyaliyawen.uben;


import java.net.InetAddress;
import java.net.UnknownHostException;

import org.junit.jupiter.api.Test;

class SocketTest {

	@Test
	public void testIntenetAddress() throws UnknownHostException {
		InetAddress address = InetAddress.getByName("www.baidu.com");
		System.out.println(address);
		
		InetAddress address2 = InetAddress.getLocalHost();
		System.out.println(address2);
	}

}
