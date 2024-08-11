package com.lucky.coding06;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double beforeTime = System.currentTimeMillis();
		
		int N = input.nextInt();
		int result = 0;
		int count = 0;
		
		for(int i = 1; i<=N; i++) {
			int sum = 0;
			for(int j = i; j<=N; j++) {
				sum += j;
				
				if( sum == N ) {
					result++;
				}
				count++;
			}
		}
		
		double afterTime = System.currentTimeMillis();
		double secDiffTime = (afterTime - beforeTime) / 1000;
		
		System.out.println("���� �ð�(m) : " + secDiffTime);
		System.out.println("������ Ƚ�� : " + count);
		
		System.out.println("��� ::: " + result);
		
	}
}
