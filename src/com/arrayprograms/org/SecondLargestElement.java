package com.arrayprograms.org;

public class SecondLargestElement {

	public static void main(String[] args) {
		int temp, size;
		int array[]= {15,7,55,78,8,56};

		size = array.length;
		
		for(int i = 0; i<size; i++ ){
			for(int j = i+1; j<size; j++){

				if(array[i]>array[j]){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("The second largest number is:: "+array[size-2]);

	}

}
