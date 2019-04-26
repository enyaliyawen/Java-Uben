package com.enyaliyawen.treeset;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;


class TestTreeSet {

	
	/*
	 * TreeSet是SortedSet接口的实现类，TreeSet可以确保集合元素处于排序状态。
	 * - Comparator comparator()
	 * - Object first()
	 * - Object last()
	 * - Object lower(Object e)
	 * - Object higher(Object e)
	 * - SortedSetsubSet(fromElement,toElement)
	 * - SortedSetheadSet(toElement)
	 * - SortedSettailSet(fromElement)
	 * TreeSet支持两种排序方法：自然排序和定制排序。默认情况下，TreeSet采用自然排序。
	 * 默认情况下TreeSet要求集合中的元素必须实现Comparable接口
	 * public int compareTo(T o):若返回0 代表两个元素相等，若返回正数，代表当前元素大，若返回负数，代表当前元素小；
	 * 
	 * TreeSet会调用每个元素的compareTo()方法去和集合中的每个已经有的元素去比较，进而决定当前元素在集合中的位置。
	 */
	@Test
	public void testTreeSetWithComparable() {
		TreeSet set = new TreeSet();
		set.add(new Person("AA",12));
		set.add(new Person("BB",16));
		set.add(new Person("CC",18));
		set.add(new Person("DD",21));
		set.add(new Person("EE",10));
		
		Iterator it = set.iterator();
		for(;it.hasNext();) {
			System.out.println(it.next());;
		}
	}

}
