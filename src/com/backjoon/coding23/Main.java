package com.backjoon.coding23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		
		int[] a = new int[N+1];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		int start = 0;
		int end = 0;
		int len = Integer.MAX_VALUE;
		int sum = 0;
		
		while(start <= end & end <= N) {
			if( sum < S ) {
				sum+=a[end++];
			} else if( sum >= S ) {
				len = Math.min(len, end-start);
				sum-=a[start++];
			}
		}
		
		System.out.println(len==Integer.MAX_VALUE ? 0 : len);
		br.close();
	}
}
