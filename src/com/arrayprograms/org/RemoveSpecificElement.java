package com.arrayprograms.org;

import java.util.Arrays;

public class RemoveSpecificElement {

	public static void main(String[] args) {

		int arr[]= {1,2,5,3,7,9,5,6};
		int index=0;
		int newArray[]= new int[arr.length];

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=9)
			{
				arr[index++]=arr[i];
			}
		}

		int resultArray[]= Arrays.copyOf(arr,index);
		
		System.out.println(Arrays.toString(resultArray));

	}

}
