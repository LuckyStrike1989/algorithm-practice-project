package com.backjoon.coding06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		int[] numbers = new int[N];
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}
		
		numbers = Arrays.stream(numbers).distinct().toArray();
		Arrays.sort(numbers);
		
		for(int number : numbers) {
			sb.append(number + "\n");
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}
}
