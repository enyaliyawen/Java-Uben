package com.enyaliyawen.JavaBasics;

public class forTestwrong {
	
	public static void main(String[] args) {
	//int i, sum;
	for(int i=1,sum=0;sum<=100;i++)
		sum+=i;
	//System.out.println("i=" +i+", sum ="+sum); compiling error, int i and int sum was declared in for statement, so outside of for statement, it can't be used.
	}
}
