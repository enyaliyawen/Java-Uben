package com.enyaliyawen.uben;

public class Arraytest {

	public static void main(String args[]) {
		int[] a = {1,3,5,7,9};
		for (int i =0;i<5;i++) {
			a[i]=a[(i+1)%5] + a[(i+2)%5];
		}
		
		System.out.println(a[3]);
	}
}
