package com.stringprograms.org;

import java.util.ArrayList;
import java.util.List;

public class CheckStringContainsAllCharcters {
	public static List<String> findContainsAllCharacterString(String[] item,String word) {
		List<String> result= new ArrayList<>();
		char[] wordchar=word.toCharArray();
		for (int i=0;i< item.length;i++) {
			String S=item[i];
			boolean containsAllCharacters=true;
			for (int j = 0; j < wordchar.length; j++) {
				char c=wordchar[j];
				if (!S.contains(String.valueOf(c))) {
					containsAllCharacters=false;
					break;
				}
			}
			if (containsAllCharacters) {
				result.add(S);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		String[] items= {"rabbit","bribe","dog"};
		String word="bib";
		List<String> result = findContainsAllCharacterString(items, word);
		System.out.println("Items containing all characters of the word '" + word + "': " + result);
	}
}
