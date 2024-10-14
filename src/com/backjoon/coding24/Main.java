package com.backjoon.coding24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static long[] getSumArray(long[] inputArray) {
		int length = inputArray.length;
		long[] sumArray = new long[length];

		long sum = 0;
		for(int i=1; i<length; i++) {
			sum += inputArray[i];
			sumArray[i] = sum;
		}
		
		return sumArray;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		long[] numbers = new long[N+1];
		long[] sumNumbers = new long[N+1];
		
		for(int i=1; i<N+1; i++) {
			numbers[i] = Long.parseLong(br.readLine());
		}
		 
		long result = 0L;
		for(int i=1; i<=M; i++) {
			for(int j=1; j<=K; j++) {
				st = new StringTokenizer(br.readLine());
				String type = st.nextToken();
				
				if( "1".equals(type) ) {
					int index = Integer.parseInt(st.nextToken());
					numbers[index] = Long.parseLong(st.nextToken());
					
				} else if( "2".equals(type) ) {					
					int start = Integer.parseInt(st.nextToken());
					int end = Integer.parseInt(st.nextToken());
					
					result = sumNumbers[end] - sumNumbers[start-1];
					bw.write(String.valueOf(result) + "\n");
				}
			}
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}
