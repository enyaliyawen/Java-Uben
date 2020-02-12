package com.enyaliyawen.JavaBasics;

public class printStars {

		public static void main(String[] args) {
			int line=4;
	        //打印一行
	        //打印上半部分
	        for(int i=0;i<line-1;i++){
	            //打印i个空格
	        	for(int j=0;j<line-1-i;j++){
	                System.out.print(" ");
	            }
	            //打印*的个数
	        	for( int j=0;j<2*i+1;j++){
	            System.out.print("*");
	        	}
	            //打印完*记得换行
	            System.out.println();
	        }   
	        //打印下半部分
	        for(int i=1;i<5;i++){
	            //打印i个空格
	        	for(int j=1;j<i+1;j++){
	        		System.out.print(" ");
	            }
	            //打印*的个数
	        	for( int j=1;j<8-2*i;j++){
	        		System.out.print("*");
	        	}
	            //打印完*记得换行
	        System.out.println();
	        }   
	    }
	}
