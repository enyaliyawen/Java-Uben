package com.enyaliyawen.uben;

public class fortest1 {
 
	public static void main(String args[]) {
		int n =0;
		for(int i=5;i>-1;i--)
		for (int j=1;j<2*i-1;j++) {
			if (i==j) n++;
		}
		
		System.out.println(n);
	}
}
