package com.mapprograms.org;

import java.util.HashMap;
import java.util.Map;

public class FindValuesofElements {

	public static void main(String[] args) {

		Map<String,Integer> map= new HashMap<>();

		map.put("apple", 1);
		map.put("orange", 21);
		map.put("banana", 10);
		map.put("mango", 17);
		map.put("guava", 25);
		map.put("pineapple", 63);
		map.put("grapes", 12);

		//		String[] keys= {"apple","orange","banana","mango","guava","pineapple","grapes"};
		//		
		//		for(int i=0;i<keys.length;i++)
		//		{
		//			String key=keys[i];
		//			
		//			if(map.containsKey(key))
		//			{
		//				System.out.println(key+" "+map.get(key));
		//			}
		//		}


		for(Map.Entry<String, Integer> entry: map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());}
	}
}
