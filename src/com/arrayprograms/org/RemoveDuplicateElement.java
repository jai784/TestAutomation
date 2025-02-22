package com.arrayprograms.org;

import java.util.Arrays;
import java.util.Iterator;

public class RemoveDuplicateElement {

	public static void main(String[] args) {

		int arr[]= {1,8,4,5,6,4,8,1,3,9,7};

		int visited=-1;

		int temp[]=new int[arr.length];

		for (int i = 0; i < arr.length; i++) {	
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					temp[j]=visited;				
				}
			}
			if (temp[i]!=visited) {	
				temp[i]=arr[i];
			}
		}
		for (int i = 0; i < temp.length; i++) {
			if (temp[i]!=visited) {
				System.out.println(temp[i]);
			}
		}
	}
}
