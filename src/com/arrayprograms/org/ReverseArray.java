package com.arrayprograms.org;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int arr[]= {2,6,5,3,7,1,4};
		int temp;
		
//		int length=arr.length;

		for (int i = 0; i < arr.length/2; i++) {

			temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;

		}
		System.out.println(Arrays.toString(arr));
//		System.out.println(length);

	}
}
