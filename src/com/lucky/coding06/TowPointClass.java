package com.lucky.coding06;

import java.util.Arrays;
import java.util.Scanner;

public class TowPointClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double beforeTime = System.currentTimeMillis();
		
		int N = input.nextInt();
		int result = 1;
		int sum = 1;
		int start_index = 0;
		int end_index = 1;
		int count = 0;
		
		int[] numbers = new int[N];
		
		for(int i = 1; i<=N; i++)
			numbers[i-1] = i;
		
		while( end_index != N ) {
			if( sum > N ) {
				sum -= numbers[start_index];
				start_index++;
			} else if( sum < N ) {
				sum += numbers[end_index];
				end_index++;
			} else {
				// sum == N
				sum += numbers[end_index];
				result++;
				end_index++;
			}
			
			count++;
		}
		
		// System.out.println("numbers :: " + Arrays.toString(numbers));
		double afterTime = System.currentTimeMillis();
		double secDiffTime = (afterTime - beforeTime) / 1000;
		
		System.out.println("실행 시간(m) : " + secDiffTime);
		System.out.println("나누기 횟수 : " + count);
		
		System.out.println("결과 ::: " + result);
	}
}
