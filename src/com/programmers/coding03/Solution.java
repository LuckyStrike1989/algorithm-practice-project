package com.programmers.coding03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static String solution(String s, int n) {
		String answer = "";
		
		StringBuilder sb = new StringBuilder();
		for( char c : s.toCharArray() ) {
			if( !Character.isAlphabetic(c) ) {
				sb.append(c);
			} else {				
				sb.append((char) (c+n));
			}
		}
		
		answer = sb.toString();
		
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(solution(s, n));
	}
}
