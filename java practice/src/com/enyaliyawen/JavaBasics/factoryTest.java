package com.enyaliyawen.JavaBasics;

interface Fruit{
	public void eat();
}
class Apple implements Fruit{
	public void eat() {
		System.out.println("Eat apples");
	}
}

public class factoryTest {
public static void main(String args[]) {
	Fruit f=new Apple();
	f.eat();
}
}
