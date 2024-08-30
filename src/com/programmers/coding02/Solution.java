package com.programmers.coding02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
	public static int[] solution(long n) {
		String strNumber = Long.toString(n);
		String reverse = new StringBuilder(strNumber).reverse().toString();

		char[] stringToChar = reverse.toCharArray();
		
		int[] answer = new int[stringToChar.length];
		
		for(int i=0; i<stringToChar.length; i++) {
			answer[i] = stringToChar[i] - '0';
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		System.out.println(Arrays.toString(solution(Long.parseLong(s))));
	}
}
