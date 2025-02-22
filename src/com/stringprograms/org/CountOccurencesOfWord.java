package com.stringprograms.org;

public class CountOccurencesOfWord {

	public static void main(String[] args) {

		String s="This is java program and java is more powerful programming language";

		String word="java";

		int count=0;

		String[] words = s.split(" ");


		for(int i=0;i<words.length;i++)
		{
			if(word.equals(words[i].toLowerCase()))
			{
				count++;
			}
		}
		
		System.out.println(count);
	}
}
