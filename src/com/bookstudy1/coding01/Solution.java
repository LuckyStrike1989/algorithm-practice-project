package com.bookstudy1.coding01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long N = Long.parseLong(br.readLine());
		
		StringBuilder sb = new StringBuilder(String.valueOf(N)).reverse();
		
		char[] arrStringToChar = sb.toString().toCharArray();
		System.out.println(Arrays.toString(arrStringToChar));
	}
}
