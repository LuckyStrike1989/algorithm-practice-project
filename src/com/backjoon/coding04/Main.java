package com.backjoon.coding04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			String s = br.readLine().toUpperCase();
			
			char[] values = s.toCharArray();
			
			int score = 0;
			int result = 0;
			for(char value : values) {				
				if( 'O' == value) {
					score++;
				} else {
					score = 0;
				}
				result += score;
			}
			
			sb.append(result + "\n");
		}
		
		System.out.println(sb);
	}
}
