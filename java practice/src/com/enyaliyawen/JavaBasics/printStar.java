package com.enyaliyawen.JavaBasics;

public class printStar {
	public static void main(String[] args) {
		int i;
		int j;
		int k;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=2*i-1;j++) {
				for(k=1;k+i==5;k++) {
					System.out.print("*");
				}
				System.out.print("");
			}
			System.out.println("*");
		}
		
		
}
}
