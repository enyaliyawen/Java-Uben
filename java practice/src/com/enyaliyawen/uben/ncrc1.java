package com.enyaliyawen.uben;

public class ncrc1 {

	public static void main(String args[]) {
		int x = 5, y = 8, z = 2, t = 0;
		//�ʺ�ǰ���ʾ�ж����������������ð��ǰ���ֵ���������������ð�ź����ֵ����������
		if (y < z) {
			z = 2;
		} else {
			y = 9;
		}
		t = x < z ? (y < z ? z : y) : x;
		System.out.println(t);
	}

}
