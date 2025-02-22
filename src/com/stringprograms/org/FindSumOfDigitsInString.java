package com.stringprograms.org;

public class FindSumOfDigitsInString {

	public static void main(String[] args) {

		String s="prince123";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);

			if(Character.isDigit(c))
			{
				sum=sum+Character.getNumericValue(c);
			}
		}
		System.out.println(sum);

	}
}
