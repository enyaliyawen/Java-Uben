package com.enyaliyawen.uben;

import java.util.Stack;
//Object pop( ) �Ƴ���ջ�����Ķ��󣬲���Ϊ�˺�����ֵ���ظö���
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
