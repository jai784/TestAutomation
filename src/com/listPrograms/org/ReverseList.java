package com.listPrograms.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {


	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Cricket");
		list.add("Hockey");
		list.add("Football");
		list.add("Badminton");
		
		Collections.reverse(list);
		System.out.println(list);
		
		int indexOf = list.indexOf("Football");
		System.out.println(indexOf);
		
		List<String> list1= new LinkedList<String>();
		
		for(int i=list.size()-1;i>=0;i++)
		{
			list1.add(i, list.get(i));
		}
		
		System.out.println(list1);
	}

}
