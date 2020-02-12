package com.enyaliyawen.JavaBasics;

public class forRecurringTest {
	//for循环后如果只有一条执行语句可以省略大括号
	public static void main(String[] args) {
		
		int i,j;
		for (i=1;i<=9;i++)
		{
			for(j=1;j<=9;j++)
			{
			System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.print("\n");
		}
	}

}
