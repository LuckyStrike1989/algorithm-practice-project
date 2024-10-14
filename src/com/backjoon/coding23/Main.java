package com.backjoon.coding23;

import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken()); 
		
		st = new StringTokenizer(br.readLine());
		
		List<Integer> numbers = new ArrayList<>();
		List<Integer> sumList = new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			numbers.add(Integer.parseInt(st.nextToken()));
		}
		
		int add = 0;
		int result = 0;
		for(int i=0; i<N; i++) {
			result = i;
			add += numbers.get(i).intValue();
			sumList.add(add);
		}
		
		
		int sum = 0;
		for(int i=1; i<sumList.size(); i++) {
			for(int j = sumList.size() - 1; j>i; j--) {
				sum = sumList.get(j) - sumList.get(i-1);
				if( S <= sum ) {
					int length = j - (i-1);
					if( length < result ) {
						result = length;
					}
				}
			}
		}
		
		bw.write(String.valueOf(result));
		bw.flush();
		
		br.close();
		bw.close();
	}
}
