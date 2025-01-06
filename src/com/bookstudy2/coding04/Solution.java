package com.bookstudy2.coding04;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public static int[] solution(int[] answers) {
		int[][] pattern = {
			{1, 2, 3, 4, 5},
			{2, 1, 2, 3, 2, 4, 2, 5},
			{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
		};
		
		int[] scores = new int[3];
		
		int count = 0;
		for(int i = 0; i<pattern.length; i++) {
			for(int j = 0; j<pattern[i].length; j++) {
				int index = j % answers.length;
				
				if( pattern[i][j] == answers[index] ) {
					count++;
				}
			}
			scores[i] = count;
			count = 0;
		}
		
		int maxScore = Arrays.stream(scores).max().getAsInt();
		
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] == maxScore) {
				answer.add(i+1);
			}
		}
		
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
	
	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
		System.out.println(Arrays.toString(solution(answers)));
	}
}
