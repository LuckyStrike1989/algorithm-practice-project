package com.backjoon.coding03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] numbers = new int[N+1];
		st = new StringTokenizer(br.readLine());
		
		
		
		for(int i = 1; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] S = new int[N+1];
		for(int i = 1; i < S.length; i++) {
			if( i == 1 ) {
				S[i] = numbers[i];
			} else {
				S[i] = S[i-1] + numbers[i];
			}
		}
		
		for(int i=0; i<M; i++) {
			st  = new StringTokenizer(br.readLine());
			
			int sIndex = Integer.parseInt(st.nextToken());
			int eIndex = Integer.parseInt(st.nextToken());
			
			int sum = S[eIndex] - S[sIndex-1];
			/*for(int j=sIndex; j <= eIndex; j++) {
				sum += numbers[j];
			}*/
			
			sb.append(sum + "\n");
		}
		
		System.out.println(sb.toString());
	}
}
