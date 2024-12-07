package com.bookstudy2.coding03;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
	private static int[] solution(int[] arr) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		for(int i = 0; i <arr.length; i++)
			for(int j = i+1; j<arr.length; j++ )
				hashSet.add(arr[i] + arr[j]);
		
		return hashSet.stream().sorted().mapToInt(Integer::intValue).toArray();
	}
	
	public static void main(String[] args) {
		int[] numbers = {2, 1, 3, 4, 1};
		System.out.println(Arrays.toString(solution(numbers)));
	}
}

