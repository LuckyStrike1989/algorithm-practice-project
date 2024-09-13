package com.bookstudy1.coding02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static String solution(String s) {
		StringBuilder sb = new StringBuilder();
		boolean isUpper = true;
		for(char c : s.toCharArray()) {
			if( Character.isAlphabetic(c) ) {
				if( isUpper ) {
					sb.append(Character.toUpperCase(c));
					isUpper = false;
				} else {
					sb.append(Character.toLowerCase(c));
					isUpper = true;
				}
			} else {
				sb.append(c);
				isUpper = true;
			}
		}
        
        return sb.toString();
    }
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(solution(br.readLine()));
		
		br.close();
	}
}
