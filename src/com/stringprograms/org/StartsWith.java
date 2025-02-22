package com.stringprograms.org;

public class StartsWith {
	public static void main(String[] args) {
		String s ="Automation Testing";
		boolean value;
		if (s.startsWith("Au")) {
			value=true;
		}
		else {
			value=false;
		}	
		System.out.println(value);
	}
}