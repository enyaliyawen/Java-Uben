package com.enyaliyawen.uben;

public class TestForStatement {

		public static void main(String args[]) {
			int i, j;
			int k=0;
			for (i=0,j=0;i<10;++i,j +=i) {
				k +=i*i+j*j;
			}
	    System.out.println(k);
		}
}
