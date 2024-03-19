package com.task1;

public class Question3 {

	public static void main(String[] args) {
		int num=876,reverse=0;
		while(num!=0) {
			int remainder=num%10;
			reverse =reverse*10+remainder;
			num =num/10;
		}
		System.out.println("The reverse of the given number is:" +reverse);
		}
		

	}
