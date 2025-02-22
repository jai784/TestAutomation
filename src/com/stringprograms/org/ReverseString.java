package com.stringprograms.org;

public class ReverseString {

	public static void main(String[] args) {

		String s= "Java Programming";
		String rev="";
		char c;
		
	
		
		int length=s.length();
		
		int size=s.length()-1;
		for (int i = size; i>=0; i--) {
			c=s.charAt(i);
			rev=rev+c;	
		}
		System.out.println("The reversed string is "+rev);
		System.out.println(length);
	}
}
