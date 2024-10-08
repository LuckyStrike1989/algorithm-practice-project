package com.backjoon.coding15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] basket = new int[N+1];
		
		for(int i=1; i<=M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int ball = Integer.parseInt(st.nextToken());
			
			for(int j = start; j <= end; j++) {
				basket[j] = ball;
			}
		}
		
		br.close();
		
		for(int i=1; i<=N; i++) {
			bw.write(basket[i] + " ");
		}
		
		bw.flush();
		bw.close();
	}
}
