package com.stringprograms.org;

public class DivideStringIntoQualParts {

	public void  stringDivide(String str,int splitCount) {

		int size=str.length();
		int part;

		if (size%splitCount!=0) {
			System.out.println("cannot divide the string");

		} else {
			System.out.println("The string can be divided into "+splitCount+" parts ");
		}

		part=size/splitCount;

		for (int i = 0; i <size; i++) {
			if(i%part==0)
			{
				System.out.println();
			}
			System.out.print(str.charAt(i));
		}

	}

	public static void main(String[] args) {

		String S1="NETWORKINFORMATION";
		int n=6;

		DivideStringIntoQualParts d= new DivideStringIntoQualParts();
		d.stringDivide(S1, n);
	}

}
