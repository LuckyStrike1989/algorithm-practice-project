package com.bookstudy2.coding02;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class SolutionExtra {
	private static int[] solution(int[] arr) {
		TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
		
		for(int num : arr) {
			set.add(num);
		}
		
		int[] result = new int[set.size()];
		
		for(int i = 0; i < result.length; i++) {
			result[i] = set.pollFirst();
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] numbers = {4, 2, 2, 1, 3, 4};
		
		System.out.println(Arrays.toString(solution(numbers)));
	}
}
