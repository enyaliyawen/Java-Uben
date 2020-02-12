package com.enyaliyawen.JavaBasics;

public class forTest {
	/*
	 * for ([初始化表达式];[条件表达式];[更新表达式])
	 * 语句或语句块
	 * 
	 * 
	 */
	public static void main(String[] args) {
	int i, sum;
	for(i=1,sum=0;sum<=100;i++)
		sum+=i;
	System.out.println("i=" +i+", sum ="+sum);
	}
}
