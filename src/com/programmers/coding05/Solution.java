package com.programmers.coding05;

import java.util.Arrays;

public class Solution {
	public static int[] solution(int[] numbers) {
		Arrays.sort(numbers);
		return numbers;
	}
	
	public static void main(String[] args) {
		int[] numbers = {2,1,1,3,2,5,4};
		
		System.out.println(Arrays.toString(solution(numbers)));
	}
}
