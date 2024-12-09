package com.backjoon.coding30;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while( st.hasMoreTokens() ) {
			numbers.add(Integer.parseInt(st.nextToken()));
		}
		
		bw.append(String.valueOf(Collections.min(numbers)));
		bw.append(" ");
		bw.append(String.valueOf(Collections.max(numbers)));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}
