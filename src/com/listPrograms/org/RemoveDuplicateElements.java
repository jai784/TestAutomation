package com.listPrograms.org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateElements {

	public static void main(String[] args) {

		List<Character> list= new ArrayList<>(Arrays.asList('c','a','t','u','c','s','t'));

		Set<Character> set= new HashSet<>(list);
		
		List<Character> list1= new ArrayList<>(set);
		System.out.println(list1);

//		list.addAll(set);
//		System.out.println(set);
//		
//		System.out.println(set);
//		
//		int indexOf = list.indexOf('s');
//		System.out.println(indexOf);
//		
//		int i = list.size();
//		System.out.println(i);



	}

}
