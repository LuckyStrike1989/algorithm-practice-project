package com.backjoon.coding28;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int N = Integer.parseInt(br.readLine());
		int[] numbers = new int[N];
		int[] orderNumbers = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		orderNumbers = numbers.clone();
		
		Arrays.sort(orderNumbers);
		
		int rank = -1;
		for(int number : orderNumbers) {			
			Integer count = map.get(number);
			
			if( count == null ) {
				rank++;
			}
			
			map.put(number, rank);
		}
		
		
		for(int i=0; i<N; i++) {
			Integer compression = map.get(numbers[i]);
			bw.write(compression + " ");
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}
