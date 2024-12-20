package com.backjoon.coding32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		int N1 = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] A = new int[N1];
		
		for(int i = 0; i < A.length; i++ )
			A[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(A);
		
		int N2 = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		// map 에 담아서 풀면 되지 않음?
		
		for(int i = 0 ; i < N2; i++) {
			if( binarySearch(A, Integer.parseInt(st.nextToken())) ) {
				sb.append("1\n");
			} else {
				sb.append("0\n");
			}
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}
	
	public static boolean binarySearch(int[] a, int key) {
		int mid;
		int low = 0;
		int high = a.length-1;
		
		while(low <= high) {
			mid = (low + high) / 2;
			if( key == a[mid] ) {
				return true;
			} else if( key < a[mid] ) {
				high = mid - 1;
			} else {
				low = low + 1;
			}
		}
		
		return false;
	}
}
