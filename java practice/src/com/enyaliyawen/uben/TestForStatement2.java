package com.enyaliyawen.uben;

public class TestForStatement2 {
 
	public static void main(String args[]) {
		int total = 0;
		for (int i=0,j=0; total<30; ++i, --j) {
			System.out.println(" i=" + i +": j= "+j);
			total +=(i+j);
		}
	}
}
