package com.stringprograms.org;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {

		String s1="Listen";
		String s2="ilent";

		if(s1.length()==s2.length())
		{
			String s3 = s1.toLowerCase();
			String s4 = s2.toLowerCase();

			char[] c1 = s3.toCharArray();
			char[] c2 = s4.toCharArray();

			Arrays.sort(c1);
			Arrays.sort(c2);

			Arrays.equals(c1, c2);
			
			System.out.println("String "+s1+" and "+s2+" are anagram");
		}else
		{
			System.out.println("String "+s1+" and "+s2+" are not anagram");
		}

	}

}
