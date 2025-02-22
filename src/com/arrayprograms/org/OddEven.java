package com.arrayprograms.org;

import java.util.Arrays;

import java.util.Arrays;

public class OddEven {

	int arr[] = {1, 5, 7, 2, 8, 3, 9, 6};

	int oddArray[]=new int[arr.length];
	int evenArray[]=new int[arr.length];

	int oddIndex,evenIndex=0;

	public void findOdd() {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2!=0) {
				oddArray[oddIndex++]=arr[i];
			}
		}
		int resultOddArray[]=Arrays.copyOf(oddArray, oddIndex);
		System.out.println(Arrays.toString(resultOddArray));
	}

	public void findEven() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				evenArray[evenIndex++]=arr[i];
			}
		}
		int resultEvenArray[]=Arrays.copyOf(evenArray, evenIndex);
		System.out.println(Arrays.toString(resultEvenArray));
	}
	public static void main(String[] args) {
		OddEven obj = new OddEven();
		obj.findOdd();
		obj.findEven();
	}
}

