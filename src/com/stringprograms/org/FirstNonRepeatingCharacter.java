package com.stringprograms.org;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String s="character";
		for (int i = 0; i < s.length(); i++) {
			boolean unique=true;		
			for (int j = 0; j < s.length(); j++) {
				
				if(i!=j&&s.charAt(i)==s.charAt(j))
				{
					unique=false;
					break;
				}	
			}
			if (unique) {
				System.out.println("The first non repeating character is "+s.charAt(i));
				break;
			}
		}
	}
}
