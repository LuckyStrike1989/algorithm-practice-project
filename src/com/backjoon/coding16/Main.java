package com.backjoon.coding16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] numbers = new int[N];
		
		for(int i=0; i<N; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		
		Arrays.sort(numbers);
		
		for(int i=0; i<N; i++) {
			bw.write(numbers[i] + "\n");
		}
		
		bw.flush();
		bw.close();
		
	}
}
