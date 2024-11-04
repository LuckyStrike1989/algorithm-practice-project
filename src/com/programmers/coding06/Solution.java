package com.programmers.coding06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;

public class Solution {
	public static Object[] solution(Integer[] numbers) {
		LinkedHashSet<Integer> map = new LinkedHashSet<>();
		
		Arrays.sort(numbers, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
			
		});
		
		for(Integer number : numbers) {
			map.add(number);
		}
		
		return map.toArray();
	}
	
	public static void main(String[] args) {
		Integer[] numbers = {4,2,2,1,3,4};
		
		System.out.println(Arrays.toString(solution(numbers)));
	}
}
