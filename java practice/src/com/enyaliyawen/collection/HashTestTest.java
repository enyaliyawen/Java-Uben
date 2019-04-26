package com.enyaliyawen.collection;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

/*
 * 关于HashSet
 * 1.HashSet是Set的典型实现,大多数时候使用Set集合时都使用这个实现类。
 * 2. HashSet中不能有重复的代码。判断两个元素相等的标准,equals()方法返回true
 * 3. HashSet根据hasCode()值来存放元素，所以不能保证元素的顺序。
 * 
 * HashSet具有一下特点
 * 1. 不能保证元素的排列顺序
 * 2. Hashset不是线程安全的
 * 3. 集合元素可以是null
 * -当向HashSet集合中存入一个元素时，HashSet会调用该对象的hasCode()方法来得到该对象的hashCode值，然后根据hashcode值决定该对象在HashSet中的存储位置。
 * -如果两个元素的equals()方法返回true,但它们的hasCode()返回值不相等，hasSet将会把它们存储在不同的位置，但依然可以添加成功。
 */
class HashTestTest {
    
	/*
	 * 测试对象排列有无顺序；HashSet()无序，LinkedHashSet有序
	 */
	@Test
	public void testHashSet() {
		Collection collection = new LinkedHashSet();
	
		Person p = new Person("AA",12);
		collection.add(p);
		collection.add(new Person("BB",13));
		collection.add(new Person("CC",14));
		
		Iterator it = collection.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
	}
	@Test
	public void testAdd() {
		
		Person p1 = new Person("AA",12);
		Person p2 = new Person("AA",12);
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p1));
		
		Set set =new HashSet();
		set.add(p1);
		set.add(p2);
		System.out.print(set.size());
	}

}
