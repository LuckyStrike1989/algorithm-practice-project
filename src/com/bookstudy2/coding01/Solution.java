package com.bookstudy2.coding01;

import java.util.Arrays;

public class Solution {
	private static int[] solution(int[] arr) {
		int[] sortedNumbers = arr.clone();
		
		Arrays.sort(sortedNumbers);
		
		return sortedNumbers;
	}
	
	public static void main(String[] args) {
		//int[] numbers = {1, -5, 2, 4, 3};
		//int[] numbers = {2, 1, 1, 3, 2, 5, 4};
		int[] numbers = {6, 1, 7};
		
		System.out.println(Arrays.toString(solution(numbers)));
	}
}
