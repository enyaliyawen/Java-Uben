package com.enyaliyawen.collection;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.jupiter.api.Test;

class TestCollection {
	
	
	@Test
	public void testToolMethod() {
		Collection collection = new ArrayList();
		collection.add("ABC");
		
		Person p = new Person("Tom",12);
		collection.add(p);
		collection.add(new Person("Jerry",13));
		collection.add(new Person("Mike",14));
		//1. contains(Object o):利用equals()方法比较，查看集合中有没有指定的元素
		boolean flag= collection.contains(new Person("lee",13));
		System.out.println(flag);
		
		//2. containsAll(Collection<?> c)：查看集合中有没有指定元素的集合
		Collection collection2 = new ArrayList();
		//collection2.add("DEF");
		collection.add(new Person("Mike",14));
		System.out.println(collection.containsAll(collection2));
		
		//3. isEmpty()：检验集合是否为空集合
		//collection.clear();
		System.out.println(collection.isEmpty());
		
		//4. toArray()：把集合元素转为Object对象的数组
		Object [] objs = collection.toArray();
		System.out.println(objs.length);
		
		//toArray(T[] a) 泛型
		
	}
	
	
	/*
	 * 1. clear():清空集合
	 * 2. remove(obj):移除指定元素,通过equals()方法在集合中查找指定的元素，若存在则移除。
	 * 3. removeAll(Collection coll);移除coll中有的元素
	 * 4. RetainAll(Collection coll)；保存coll中有的元素
	 * 
	 */
	@Test
	public void testRemove() {
		Collection collection = new ArrayList();
		collection.add("Arraylist");
		Person p = new Person("Enya",20);
		collection.add(p);
		collection.add(new Person("Rachel",20));
		System.out.println(collection.size());
		//collection.clear();
		//System.out.println(collection.size());
		collection.remove(p);
		System.out.println(collection.size());	
	}
	
	@Test
	public void testRemove2() {
		Collection collection = new ArrayList();
		collection.add("Arraylist");
		Person p = new Person("Enya",20);
		collection.add(p);
		collection.add(new Person("Rachel",20));
		System.out.println(collection.size());
		//collection.clear();
		//System.out.println(collection.size());
		collection.remove(p);
		collection.remove(new Person("Rachel",20));
		System.out.println(collection.size());	
	}
	
	@Test
	public void testRemove3() {
		Collection collection = new ArrayList();
		collection.add("ABC");
		
		Person p = new Person("Tom",12);
		collection.add(p);
		collection.add(new Person("Jerry",13));
		collection.add(new Person("Mike",14));
		System.out.println(collection.size());
		//collection.clear();
		//System.out.println(collection.size());
		//collection.remove(p);
		//collection.remove(new Person("Rachel",20));
		Collection collection2 = new ArrayList();
		//System.out.println(collection.size());
		collection2.add("ABC");
		collection2.add(new Person("Mike",14));
		collection.removeAll(collection2);
		System.out.println(collection.size());	
	}
	
	@Test
	public void testRetainAll() {
		Collection collection = new ArrayList();
		collection.add("ABC");
		
		Person p = new Person("Tom",12);
		collection.add(p);
		collection.add(new Person("Jerry",13));
		collection.add(new Person("Mike",14));
		System.out.println(collection.size());
		//collection.clear();
		//System.out.println(collection.size());
		//collection.remove(p);
		//collection.remove(new Person("Rachel",20));
		Collection collection2 = new ArrayList();
		//System.out.println(collection.size());
		//collection2.add("ABC");
		collection2.add("DEF");
		collection2.add(new Person("Mike",14));
		collection.retainAll(collection2);
		System.out.println(collection.size());	
		System.out.print(collection);
	}
	
	/*
	 * 在collection中无法获取指定的元素，但可以遍历所有的元素
	 * 1.使用增强的for循环
	 * 2.使用Iterator迭代器
	 * 2.1获取迭代器对象：调用Collection的iterator()方法，获取Iterator接口的对象
	 * 2.2 调用Iterator接口的方法进行迭代
	 */
	@Test
	public void testIterator() {
		Collection collection = new ArrayList();
		System.out.println(collection.size());
		collection.add("Arraylist");
		collection.add(new Person("Enya",20));
		collection.add(new Person("Rachel",20));
      //这个增强的for循环是我不会用的，留意一下之后是怎么用的
	
		for(Object obj:collection) {
			System.out.println(obj);
		}
		
		Iterator it = collection.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	  //若下一条记录无效，还调用next()方法,则抛出NoSuchElementException异常
		Object obj = it.next();
	
	}
	
	/*
	 * addAll(collection coll);添加一组元素到集合中；
	 */
	@Test
	public void testAddAll() {
		Collection collection2 = new ArrayList();
		collection2.add("努力学习ing");
		Collection collection = new ArrayList();
		collection.add("学习Java");
		collection.add(new Person("Rachel",18));
		
		//我当时写的是collection2 = collection2.addAll(collection);
		collection2.addAll(collection);
		
		 System.out.println(collection2.size());
	}

	@Test
	public void testAdd() {
		/*
		 * 1. add(object obj); 添加一个元素到集合中
		 * 2. 有黄的波浪线是因为没用泛型
		 */
		
		Collection collection = new ArrayList();
		System.out.println(collection.size());
		collection.add("Arraylist");
		collection.add(new Person("Enya",20));
		System.out.println(collection.size());
	}

}
