package com.arrayprograms.org;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {

		int array1[]= {5,2,3,1};
		int array2[]= {4,6,3,7};

		int mergedArray[]= new int[array1.length+array2.length];

		for(int i=0;i<array1.length;i++)
		{
			mergedArray[i]=array1[i];
		}

		for (int i = 0; i < array2.length; i++) {

			mergedArray[array1.length+i]=array2[i];

		}

		System.out.println(Arrays.toString(mergedArray));
	}
}
