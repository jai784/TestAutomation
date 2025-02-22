package com.stringprograms.org;

public class SeparateCharDigitsSybols {

	public static void main(String[] args) {

		String s="HelloWorld@12#3";

		StringBuilder chars= new StringBuilder();
		StringBuilder digits = new StringBuilder();
		StringBuilder specialChar = new StringBuilder();


		for (int i = 0; i <s.length(); i++) {
			char c = s.charAt(i);

			if (Character.isAlphabetic(c)) {
				chars.append(c);
			}else if (Character.isDigit(c)) {
				digits.append(c);
			}else {
				specialChar.append(c);
			}
		}
		System.out.println("Characters: "+chars+"\n"+"Digits: "+digits+"\n"+"Special Characters: "+specialChar);

	}

}
