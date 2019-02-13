package com.enyaliyawen.uben;

import java.util.Scanner;

public class TestScanner {

	  
	static String name;
	static char sex; // why char
	static short age;
	static float height;
	static String type;
	
	public static void main(String[] args) {
		//小明   豪爽的 女士 
		Scanner scanner = new Scanner(System.in);
		System.out.println("姓名 : ");
		name= scanner.next();
		System.out.println("性别： ");
		sex=scanner.next().charAt(0);
		System.out.println("年龄： ");
		age=scanner.nextShort();
		System.out.println("身高： ");
		height=scanner.nextFloat();
		System.out.println("性格： ");
		type=scanner.next();
		System.out.print("嗨，大家好，我叫： " +name);
		System.out.print(", 今年： "+ age+" 岁");
		System.out.print(", 身高： "+ height+" 米");
		System.out.print(", 我是一个 "+ type+sex+" 士");
			
	}
	
}
