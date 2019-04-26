package com.enyaliyawen.uben;

public class ncrc3 {

	//https://www.cnblogs.com/ErMengNJUniverser/p/6240844.html
	public static void main(String args[]) {
		int n = 0, score = 65;
		switch (score / 10) {
		case 9:
			n++;
		case 8:
		case 7:
			n++;
			break;
		default:
			n++;
			System.out.println(n);
		}
	}
}
