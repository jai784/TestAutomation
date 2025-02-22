package com.mapprograms.org;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateElements {

	public static void main(String[] args) {

		String s="Elements";

		Map<Character,Integer> map = new HashMap<>();

		char[] cs = s.toCharArray();

		for (int i = 0; i < cs.length; i++) {

			if(map.containsKey(cs[i]))
			{
				map.put(cs[i], map.get(cs[i])+1);
			}else {
				map.put(cs[i], 1);
			}
		}
		Set<Character> keySet = map.keySet();

		for (Character c : keySet) {
			if(map.get(c)>1)
			{
				System.out.println(c+" "+map.get(c));
			}

		}	
	}
}
