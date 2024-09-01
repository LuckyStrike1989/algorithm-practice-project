package com.backjoon.coding12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine().toUpperCase();
		
		char[] charArray = s.toCharArray();
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		int index = 2;
		for(char c = 'A'; c<='Z'; c++) {
			System.out.println(c - 'A');
		}
	}
}
