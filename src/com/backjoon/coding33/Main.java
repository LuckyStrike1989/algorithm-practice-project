package com.backjoon.coding33;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] arrTemp = new int[n+1];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			arrTemp[i] = Integer.parseInt(st.nextToken());
		}
		
		int start = 0; 
		int end = 0;
		int sum = 0;
		
		while(start <= end && end <= n) {
			
		}
	}
}
