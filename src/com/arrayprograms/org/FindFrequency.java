package com.arrayprograms.org;

public class FindFrequency {

	public static void main(String[] args) {

		int arr[]= {5,8,4,8,1,2,5,4,3,8,5};
		int fr[]=new int[arr.length];
		int visited=-1;

		for (int i = 0; i < arr.length; i++) {

			int count=1;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {

					fr[j]=visited;
					count++;
				}
			}
			if (fr[i]!=visited) {
				fr[i]=count;

			}

		}
		for (int i = 0; i < fr.length; i++) {

			if (fr[i]!=visited) {
				System.out.println(arr[i]+" | "+fr[i]);
			}
		}
	}
}
