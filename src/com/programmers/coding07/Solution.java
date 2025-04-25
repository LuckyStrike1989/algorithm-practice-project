package com.programmers.coding07;

import java.util.Arrays;

public class Solution {
	public static String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i]-1]) {
                answer[i] = "Same";
            }
            else {
                answer[i] = "Different";
            }
        }

        return answer;
    }
	
	public static void main(String[] args) {
		int[] numbers = {3,4};
		int[] our_score = {85, 93};
		int[] score_list = {85, 92, 38, 93, 48, 85, 92, 56};

		/*int[] numbers = {1};
		int[] our_score = {100};
		int[] score_list = {100, 80, 90, 84, 20};*/
		
		String result[] = solution(numbers, our_score, score_list);
		
		System.out.println(Arrays.toString(result));
	}
}
