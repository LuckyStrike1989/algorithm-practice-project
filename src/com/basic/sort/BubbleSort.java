package com.basic.sort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
	public static void main(String[] args) {
		int[] numbers = new int[100000];
		
		Random random = new Random();
		
		for(int i = 0; i < 100000; i++) {
			numbers[i] = random.nextInt(10000) + 1;
		}
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < (numbers.length - i) -1; j++) {
				if( numbers[j] > numbers[j+1] ) {
					int temp = numbers[j];
					numbers[j+1] = temp;
					numbers[j] = numbers[j+1];
				}
			}
			
		}
		
		System.out.println(Arrays.toString(numbers));
	}
}
