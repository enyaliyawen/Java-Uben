package com.enyaliyawen.JavaBasics;

//"%"取余数
public class breakTest {
	public static void main(String[] args) {
		int i;
		for (i=1;i<=10;i++)
		{
			if(i%3==0)
				break;
			System.out.println("i ="+i);
		}
		System.out.println("循环中断：i= " +i);
	}

}
