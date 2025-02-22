package com.stringprograms.org;

public class ConsecutiveIdenticalLetters {

	public static void main(String[] args) {

		String s="Success";
		
		boolean result = hasConsecutiveIdenticalLetters(s);
		
		if (result) {
			
			System.out.println("The String has consecutive identical letters");
			
		} else {
			
			System.out.println("The String has not consecutive identical letters");
		}

	}


	public static boolean hasConsecutiveIdenticalLetters(String str)
	{

		if (str==null || str.length()<2) {
			return false;
		}

		for (int i = 0; i < str.length()-1; i++) {

			if (str.charAt(i)==str.charAt(i+1)) {

				return true;

			}
		}

		return false;

	}


}
