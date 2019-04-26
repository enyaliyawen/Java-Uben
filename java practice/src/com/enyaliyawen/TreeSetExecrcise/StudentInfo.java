package com.enyaliyawen.TreeSetExecrcise;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentInfo {
     static String name;
     static int score;
	
     public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Student name: ");
        name = scanner.next();
        System.out.println("Student score： ");
		score=scanner.nextInt();
		
	TreeSet set = new TreeSet();
	set.add(new Student("Enya",12));
	set.add(new Student("bill",12));
	set.add(new Student("sam",12));
	
	printSet(set);
		
	}

	private static void printSet(TreeSet set) {
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	};
}
