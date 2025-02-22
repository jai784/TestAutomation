package com.listPrograms.org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveCommonElementsInArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list1= new ArrayList<Integer>();
		ArrayList<Integer> list2= new ArrayList<Integer>();
		
		list1.add(9);
		list1.add(6);
		list1.add(2);
		list1.add(9);
		list1.add(0);
		
		list2.add(9);
		list2.add(1);
		list2.add(9);
		list2.add(4);
		list2.add(5);
		
		list1.removeAll(list2);
		System.out.println(list1);

	}

}
