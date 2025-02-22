package com.listPrograms.org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonElementsInArrayList {

	public static void main(String[] args) {

		List<String> list1= new ArrayList<>(Arrays.asList("Apple","Banana","Orange","Guava","Strawberry"));
		List<String> list2= new ArrayList<String>(Arrays.asList("Guava","Pineapple","Pomogranate","Lemon","Orange"));
		
		List<String> common=new ArrayList<String>(list1);
		common.retainAll(list2);
		
		System.out.println(common);
		
	}

}
