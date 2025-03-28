package com.backjoon.coding38;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		
		HashSet<String> mapList = new HashSet<>();
		
		for(int i=0; i<M; i++) {
			mapList.add(br.readLine());
		}
		
		int count = 0;
		for(int i=0; i<S; i++) {
			if( mapList.contains(br.readLine()) )
				count++;
		}
		
		System.out.println(count);
		
		br.close();
	}
}
