package com.mapprograms.org;
import java.util.Map;
import java.util.LinkedHashMap;

	public class RemoveDuplicateFromString {

	public static void main(String[] args) {

		String s="Automation";

		Map<Character,Boolean>map= new LinkedHashMap<>();

		for (int i = 0; i <s.length(); i++) {

			char c= s.charAt(i);

			map.put(c, true);

		}

		StringBuilder s1= new StringBuilder();

		for(Character ch:map.keySet())
		{
			s1.append(ch);
		}
		System.out.println(s1);
	}

}
