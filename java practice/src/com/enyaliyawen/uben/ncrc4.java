package com.enyaliyawen.uben;

public class ncrc4 {

	public static void main(String args[]) {
		int x = 4;
		String str = "";
		str = str + ((x > 4) ? 99.9 : 9.0);
		System.out.println(str.indexOf('0'));
	}
}
