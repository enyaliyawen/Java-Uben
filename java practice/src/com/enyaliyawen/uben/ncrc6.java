package com.enyaliyawen.uben;

public class ncrc6 {

	public static void main(String args[]) {
		int[][] a = { { 1, 4, 3, 2 }, { 8, 6, 5, 7 }, { 3, 7, 2, 5 }, { 4, 8, 6, 1 } };
		int i, j, k, t;
		for (i = 0; i < 3; i++) {
			k = 0;
			for (j = k + 1; j < 4; j++)
				if (a[i][k] < a[i][j])
					k = j;
			t = a[i][0];
			a[i][0] = a[i][k];
			a[i][k] = t;
		}
		for (i = 0; i < 4; i++)
			System.out.println(a[i][0] + " ");
	}
}
