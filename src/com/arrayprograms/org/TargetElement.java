package com.arrayprograms.org;

public class TargetElement {

	int[] arr= {2,4,3,5,7,8,9};

	int target=10;

	public void findTarget() {

		for (int i = 0; i < arr.length; i++) {

			for (int j = i+1; j < arr.length; j++) {

				if(arr[i]+arr[j]==target) {

					System.out.println(arr[i]+" "+arr[j]);

					break;
				}

			}

		}

	}

	public static void main(String[] args) {
		
		TargetElement t= new TargetElement();
		t.findTarget();

	}

}
