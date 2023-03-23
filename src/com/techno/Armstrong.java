package com.techno;

public class Armstrong {

	public static void main(String[] args) {
		int number = 371;
		int r=0,sum=0;
		int temp=number;
		System.out.println("Your number provided is" +number);
		while (temp>0){
			r=temp%10;
			sum=sum+(r*r*r);
			temp = temp/10;
			
		}
		if(sum==number) {
			System.out.println(number +"is an Armstrong number");
		}
		else {
			System.out.println(number +"is not an Armstrong number");
		}
	}

}
