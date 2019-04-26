package com.enyaliyawen.uben;

public class ncrc1 {

	public static void main(String args[]) {
		int x = 5, y = 8, z = 2, t = 0;
		//问号前面表示判断条件，如果成立将冒号前面得值赋给变量；否则把冒号后面的值赋给变量；
		if (y < z) {
			z = 2;
		} else {
			y = 9;
		}
		t = x < z ? (y < z ? z : y) : x;
		System.out.println(t);
	}

}
