package com.arrayprograms.org;

public class CheckPrimeNumber {

	public static void main(String[] args) {

		int num=89;

		boolean flag = false;

		if (num==0||num==1) {
			flag=true;
		}

		for (int i = 2; i <=num/2; i++) {
			if (num%i==0) {
				flag=true;
			}

		}

		if (!flag) {
			System.out.println(num+" is a prime nunber");
		}else {
			System.out.println(num+" is not a prime nunber");
		}
	}

}
