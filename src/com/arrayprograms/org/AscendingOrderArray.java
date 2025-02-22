package com.arrayprograms.org;

import java.util.Arrays;

public class AscendingOrderArray {

	public static void main(String[] args) {
		int arr[]= {8,4,2,10,6,3,9,1,7,5};// 2,8,2,1
		int temp;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i+1; j < arr.length; j++) {

				if (arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
//				System.out.println(Arrays.toString(arr));
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
