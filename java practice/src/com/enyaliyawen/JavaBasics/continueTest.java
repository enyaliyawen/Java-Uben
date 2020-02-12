package com.enyaliyawen.JavaBasics;

public class continueTest {
	public static void main(String[] args) {
		int i;
		for (i=1;i<=10;i++) {
			if(i%3==0)
				continue;
			System.out.println("i ="+i);
		}
		System.out.println("循环中断 : i=" +i);
	}

}
