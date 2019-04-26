package com.enyaliyawen.uben;

import java.util.Stack;
//Object pop( ) 移除堆栈顶部的对象，并作为此函数的值返回该对象。
public class ncrc5 {

	public static void main(String args[]) {
		Stack stk = new Stack();
		stk.add(0);
		stk.add(1);
		stk.add(2);
		for (int i = 0; i < 4; i++)
			System.out.println(stk.pop() + " ");
	}
}
