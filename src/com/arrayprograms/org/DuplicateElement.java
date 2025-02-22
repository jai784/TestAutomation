package com.arrayprograms.org;

public class DuplicateElement {

	public static void main(String[] args) {

		int arr[]= {15,45,25,30,45,75,30,12};

		int size=arr.length;

		for (int i = 0; i < size; i++) {

			for (int j = i+1; j < size; j++) {

				if (arr[i]==arr[j]) {

					System.out.println(arr[j]);
				}
			}
		}
	}
}
