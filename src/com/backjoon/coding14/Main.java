package com.backjoon.coding14;

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
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = null;
		
		for(int i = 0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int result = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			bw.write(String.valueOf(result + "\n"));
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
