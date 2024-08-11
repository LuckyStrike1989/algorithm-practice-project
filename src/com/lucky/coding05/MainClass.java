package com.lucky.coding05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MainClass {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] A = new int[N];
		int[] S = new int[N];
		int[] C = new int[N];
		
		int result = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
			
			if( i == 0 ) {
				S[i] = A[i];
			} else {
				S[i] = S[i-1] + A[i];
			}
		}
		
		for(int i = 0; i < N; i++) {
			C[i] = S[i] % M;
			
			if( C[i] == 0 ) {
				++result;
			}
		}
		
		System.out.println("A[] ::: " + Arrays.toString(A));		
		System.out.println("S[] ::: " + Arrays.toString(S));
		System.out.println("C[] ::: " + Arrays.toString(C));
		System.out.println("result ::: " + result);
	}
}
