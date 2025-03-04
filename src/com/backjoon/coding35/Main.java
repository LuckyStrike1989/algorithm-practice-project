package com.backjoon.coding35;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		s.toLowerCase();
		
		char[] c = s.toCharArray();
		
		int start = 0;
		int end = s.length() - 1;
		
		int result = 1;
		for(int i = 0; i < s.length(); i++) {
			if( c[start+i]!=c[end-i] ) {
				result = 0;
				break;
			}
		}
		
		System.out.println(result);
		
		br.close();
	}
}
