package com.arrayprograms.org;

import java.util.Arrays;

public class ReplaceElementWithNextGreatestElement {

	public static void main(String[] args) {

		int arr[]= {45, 20, 100, 23, -5, 2, -6};
		
		int size=arr.length; int temp;
		
		int maxRightElement=arr[size-1];
		
		arr[size-1]=-1;
		
		for(int i=size-2;i>=0;i--)
		{
			temp=arr[i];
			arr[i]=maxRightElement;
			if(maxRightElement<temp)
			{
				maxRightElement=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
