package com.enyaliyawen.uben;

import java.util.Scanner;

public class TestScanner {

	//static变量作为类的变量，与放在方法中定义不同  
	static String name;
	static char sex; // why char
	static short age;
	static float height;
	static String type;
	
	public static void main(String[] args) {
		//小明   豪爽的 女士 ,先把中文贴在这里，直接在console写可能会出错
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
