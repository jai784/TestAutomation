package com.arrayprograms.org;

import java.util.Arrays;

public class EvenBeforeOdd {

	public static void main(String[] args) {
		int arr[]= {4,5,7,2,6,1,4,11};
		int j=-1,temp;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				j++;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
