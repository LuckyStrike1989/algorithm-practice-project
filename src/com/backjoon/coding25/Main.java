package com.backjoon.coding25;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] numbers = new int[N+1];
		int[] arrSum = new int[N+1];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=1; i<=N; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum = 0;
		for(int i=1; i<=N; i++) {
			sum += numbers[i];
			arrSum[i] = sum;
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			bw.write(String.valueOf(arrSum[end] - arrSum[start-1]));
			bw.newLine();
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}
