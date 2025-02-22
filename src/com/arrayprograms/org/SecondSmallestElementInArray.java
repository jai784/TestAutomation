package com.arrayprograms.org;

public class SecondSmallestElementInArray {


	public static void main(String[] args) {
		int arr[] = {11, 21, 5, 10, 11, 55, 19};

		int temp;

		// Sorting the array in ascending order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Second Smallest Number is " + arr[1]);
	}

}
