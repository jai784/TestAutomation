package com.stringprograms.org;

public class ReverseAlternateWord {

	public static void main(String[] args) {

		String s ="Selenium used for automating web applications";

		String[] words = s.split(" ");

		String reversedSentence="";
		String reversedWord="";

		for (int i = 0; i < words.length; i++) {

			String word=words[i];

			if(i%2!=0)
			{
				for (int j = word.length()-1; j>=0; j--) {
					char c=word.charAt(j);
					reversedWord=reversedWord+c;
				}

				reversedSentence=reversedSentence+reversedWord+" ";
				reversedWord="";
			}else {
				reversedSentence=reversedSentence+words[i]+" ";
			}	
		}
		System.out.println(reversedSentence);
	}

}
