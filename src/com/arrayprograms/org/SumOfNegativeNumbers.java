package com.arrayprograms.org;

public class SumOfNegativeNumbers {

	public static void main(String[] args) {

		int arr[]= {1,7,-5,8,3,-9,2,-1};
		int sum=0;

		for (int i = 0; i < arr.length; i++) {

			if(arr[i]<0)
			{
				sum=sum+arr[i];
			}

		}
		System.out.println(sum);

	}

}
