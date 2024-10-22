package com.backjoon.coding29;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] myNumbers = new int[N];
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			myNumbers[i] = Integer.parseInt(st.nextToken());
		}
		
		int K = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<K; i++) {
			map.put(st.nextToken(), 0);
		}
		
		for(int i=0; i<N; i++) {
			Integer count = ( map.containsKey(String.valueOf(myNumbers[i])) ) ? 1 : 0;
			
			if( map.containsKey(String.valueOf(myNumbers[i])) ) {
				map.put(String.valueOf(myNumbers[i]), count);
			}
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			bw.write(entry.getValue() + " ");
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}
