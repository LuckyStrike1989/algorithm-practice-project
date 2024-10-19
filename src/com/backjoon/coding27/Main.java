package com.backjoon.coding27;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] numbers = new int[N][2];
		StringTokenizer st;
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			numbers[i][0] = Integer.parseInt(st.nextToken());
			numbers[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(numbers, (o1, o2) -> {
			if( o1[1] == o2[1] ) {
				return o1[0] - o2[0];
			} else {
				return o1[1] - o2[1];
			}
		});
		
		for(int i=0; i<numbers.length; i++) {
			bw.write(String.valueOf(numbers[i][0]) +" "+ String.valueOf(numbers[i][1]));
			bw.newLine();
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}
