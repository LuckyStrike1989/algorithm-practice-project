package com.lucky.coding03;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input_number = scan.nextInt();
		int query_number = scan.nextInt();
		
		int a[] = new int[input_number+1];
		int s[] = new int[input_number+1];
		
		for(int i = 1; i < a.length; i++ ) { 
			a[i] = scan.nextInt();
		}
		
		for(int i = 1; i < s.length; i++ ) {
			if( i != 0 ) {
				s[i] = s[i-1] + a[i];
			} else {
				s[i] = a[i];
			}
		}
		
		for(int i = 0; i < query_number; i++) {
			int start = scan.nextInt();
			int end = scan.nextInt();
			
			System.out.println(s[end] - s[start-1]);
		}
	}
}
