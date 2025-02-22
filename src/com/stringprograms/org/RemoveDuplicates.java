package com.stringprograms.org;

public class RemoveDuplicates {

	public static void main(String[] args) {

		//		String input="Automation";
		//		String output="";
		//
		//		for(int i=0;i<input.length();i++)
		//		{
		//			if (!output.contains(String.valueOf(input.charAt(i)))) {
		//				output+=String.valueOf(input.charAt(i));				
		//			}
		//		}
		//
		//		System.out.println("String after removing duplicates "+output);

		String s="average";
		char[] charArray = s.toCharArray(); // ['a','v','e','r','a','g','e']

		String s1="";

		for (int i = 0; i < charArray.length; i++) {

			if(s1.indexOf(charArray[i])==-1)  //s1.indexOf(a) // s1="" // averg.indexOf('a') =
			{
				s1+=charArray[i]; // s1=s1+charArray[i];  
			}

		}

		System.out.println("String after removing duplicates "+s1);




	}

}
