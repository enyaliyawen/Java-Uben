package com.enyaliyawen.JavaBasics;

public class forTest01 {
	public static void main(String[] args) {
		int m=2;
		int p=1;
		int t=0;
		for (;p<5;p++) {
			if(t++>m) {
				m=p+t;
			}
		}
		System.out.print("t equals " +t);
	}

}
