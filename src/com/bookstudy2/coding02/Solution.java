package com.bookstudy2.coding02;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
	private static int[] solution(int[] arr) {
		Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
		Arrays.sort(result, Collections.reverseOrder());
		return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
	}
	
	public static void main(String[] args) {
		int[] numbers = {4, 2, 2, 1, 3, 4};
		System.out.println(Arrays.toString(solution(numbers)));
	}
}
