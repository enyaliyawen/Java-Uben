package com.enyaliyawen.TreeSetExecrcise;

public class Student implements Comparable {
 
	private String name;
	private int score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	@Override
	public int compareTo(Object o) {
		if (o instanceof Student) {
			Student stu = (Student) o;
			return stu.score - this.score;
		}else {
			throw new ClassCastException("不能转为 student 类型");
		}
	}
	
}
