package com.enyaliyawen.collection;

public class Person {
     private String name;
     
     private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
    
	/*
	 * 为什么在hashCode方法中有质数存在：
	 * Person p1: name的hashCode值为1000, age hashCode值为22
	 * Person p2: name的hashCode值为22, age hashCode值为1000
	 * 如果相加的话可能相等， 但是1000*质数31 ！= 22*质数33
	 * @see java.lang.Object#hashCode()
	 */
	
	@Override
	public int hashCode() {
		final int prime = 31;//质数
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
    
	/*
	 * 以下代码模拟极端情况,equals()和hashCode()不一样。正常情况下两个对象equals()相等，则hashCode()也相等，反之亦然
	 */
	/*private static int initHashCode = 1;
	
	@Override
	
	public int hashCode() {
		
		return initHashCode++;
	}*/
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
     
}
