package com.arrayprograms.org;

import java.util.Arrays;

public class MaxProduct {

	public static void main(String[] args) {
		int arr[]= {-11,-10,5,7,2,9,4,11,3,1};
		int maxProduct=Integer.MIN_VALUE;
		int max_i=-1; int max_j=-1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(maxProduct<arr[i]*arr[j])
				{
					maxProduct=arr[i]*arr[j];
					max_i=arr[i];
					max_j=arr[j];
				}	
			}	
		}
		System.out.println("The max elements are: "+ max_i+" "+max_j);
		System.out.println("The max product is: "+ maxProduct);
	}
}
