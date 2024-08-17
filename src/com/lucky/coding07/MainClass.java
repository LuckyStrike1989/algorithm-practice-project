package com.lucky.coding07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MainClass {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int[] items = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			items[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(items);
		
		int start_index = 0;
		int end_index = items.length - 1;
		int count = 0;
		for(int i = 0; i < items.length; i++) {
			if( items[start_index] + items[end_index] < M ) {
				start_index++;
			} else if( items[start_index] + items[end_index] > M ) {
				end_index--;
			} else {
				start_index++;
				count++;
			}
		}
		
		System.out.println(count);
		br.close();
	}
}
