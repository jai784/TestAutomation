package com.arrayprograms.org;

import java.util.Arrays;

public class DescendingOrderArray {

	public static void main(String[] args) {

		int arr[]= {5,1,7,3,9,6,2,10};
		int temp;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i+1; j < arr.length; j++) {

				if(arr[j]>arr[i])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;

				}

			}

		}

		System.out.println(Arrays.toString(arr));

	}

}
