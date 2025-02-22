package com.arrayprograms.org;

import java.util.Arrays;

public class AverageExceptLargestAndSmallest {

	public static void main(String[] args) {

		int arr[]= {5,7,2,4,9};
		float sum=0;
		int max=arr[0];
		int min=arr[0];
		
		float average;
		for (int i = 0; i <=arr.length-1; i++) {
			sum+=arr[i];
			if(arr[i]>max)
			{
				max=arr[i];
			}else if (arr[i]<min) {
				min=arr[i];
			}
		}
		average=((sum-max-min)/(arr.length-2));
		System.out.println("The average is "+average);

	}
}
