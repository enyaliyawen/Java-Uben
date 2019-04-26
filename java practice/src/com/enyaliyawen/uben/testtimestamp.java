package com.enyaliyawen.uben;

public class testtimestamp {
	public static void main(String args[]) {
		String str = "/Date(1554076800000)/";
		//int n = str.length();
		//public char charAt(int index)£¬index : index number, starts with 0
		//char ch = str.charAt(0);
		String str1 = null;
		str1=str.substring(str.indexOf("(")+1, str.lastIndexOf(")"));
		System.out.println(str1);
	}
}
