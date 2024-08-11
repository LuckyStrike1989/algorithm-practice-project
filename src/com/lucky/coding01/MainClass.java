package com.lucky.coding01;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String inputNumber = scan.next();
		
		char [] numbers = inputNumber.toCharArray();
		int result = 0;
		
		for(char number : numbers) {
			String temp = String.valueOf(number);
			result += Integer.parseInt(temp);
		}	
		
		System.out.println(result);
	}
}
