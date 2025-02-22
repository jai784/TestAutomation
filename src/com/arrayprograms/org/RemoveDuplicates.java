package com.arrayprograms.org;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int a[]= {5,7,3,1,5,9,3};

		int temp[]=new int[a.length];

		int index=0;

		for(int i=0;i<a.length;i++)
		{
			boolean isDuplicate=false;

			for(int j=0;j<index;j++)
			{
				if(a[i]==temp[j])
				{
					isDuplicate=true;
					
				}
			}
			if(!isDuplicate)
			{
				temp[index++]=a[i];
			}
		}

		int resultArray[]=Arrays.copyOf(temp, index);
		System.out.println(Arrays.toString(resultArray));
	}

}
