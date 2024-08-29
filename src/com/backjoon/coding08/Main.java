package com.backjoon.coding08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] numbers = new int[5];
		
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
			sum += numbers[i];
		}
		
		Arrays.sort(numbers);
		
		int midValue = (1 + numbers.length) / 2;
		int average = sum / numbers.length;
		
		System.out.println(average);
		System.out.println(numbers[midValue-1]);
		
		br.close();
	}
}
