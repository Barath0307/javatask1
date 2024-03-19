package com.task1;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the purchase amount");
		int purchasechoice=sc.nextInt();
		if(purchasechoice<500) {
			System.out.println("No Discount");
		}else if (purchasechoice>=500 && purchasechoice<=1000) {
			System.out.println("10% Discount");
		}else {
			System.out.println("20% Discount");
		}
		
	}
}
