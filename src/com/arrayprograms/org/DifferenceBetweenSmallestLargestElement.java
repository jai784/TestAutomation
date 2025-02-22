package com.arrayprograms.org;

public class DifferenceBetweenSmallestLargestElement {

	public static void main(String[] args) {

		int arr[]= {5,-1,4,-3,8,6,-10,2};
		int max=arr[0];
		int min=arr[0];

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			else if (arr[i]<min) 
			{
				min=arr[i];
			}
		}
		System.out.println("The difference between smallest and largest element "+ (max-min));

		for(int i=0;i<arr.length;i++)
		{
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}		
		}
		System.out.println("The difference between smallest and largest element "+ (arr[0]-arr[arr.length-1]));	

	}
}


