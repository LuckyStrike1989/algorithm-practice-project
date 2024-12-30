package com.basic.sort;

import java.util.Arrays;
import java.util.Random;

public class InsertSort {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		
		Random random = new Random();
		
		for(int i = 0; i<numbers.length; i++) {
			numbers[i] = random.nextInt(10000) + 1;
		}
		
		System.out.println("not sorted ::: " + Arrays.toString(numbers));
		System.out.println("----------------------------------");
		
		for(int i = 1; i<numbers.length; i++) {
			int target = numbers[i];
			
			int j = i -1;
			
			System.out.println(j);
			while( j >= 0 && target < numbers[j] ) {
				numbers[j + 1] = numbers[j];
				j--;
				System.out.println(Arrays.toString(numbers));
			}
			
			numbers[j+1] = target;
			
			System.out.println(Arrays.toString(numbers));
			System.out.println("----------------------------------");
		}
		
		System.out.println("result ::: " + Arrays.toString(numbers));
	}
}
