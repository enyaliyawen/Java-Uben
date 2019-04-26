package com.enyaliyawen.uben;

public class Javamatrix {
    public static void main(String[] args) {
        int[][] aMatrix = {{1,1,1,1,1},{2,2,2,2,2},{3,3,3,3,3},{4,4,4,4,4}};
		int i = 0; //Ñ­»·±äÁ¿
		int j = 0; //Ñ­»·±äÁ¿
        //print matrix
        for (i = 0; i < aMatrix.length; i++) {
   //*********Found********
	       for ( j = 0; j < aMatrix[i].length; j++) {
   //*********Found********
	        System.out.print(aMatrix[i][j] + " ");
	       }
	    System.out.println();
        }
    }
}

