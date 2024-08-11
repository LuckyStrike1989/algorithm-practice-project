package com.lucky.coding05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AnswerClass {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 수열의 개수
		int N = Integer.parseInt(st.nextToken());
		
		// 나누어떨어져야 하는 수(나누기 하는 수)
		int M = Integer.parseInt(st.nextToken());
		
		// 합배열
		long[] S = new long[N];
		
		// 같은 나머지의 인덱스를 카운트하는 배열
		long[] C = new long[M];
		
		// 정답
		long answer = 0;
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			// 수열 합 배열 만들기 공식
			if( i == 0 ) {
				S[i] = Integer.parseInt(st.nextToken());
			} else {
				S[i] = S[i-1] + Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.println("S[] ::: " + Arrays.toString(S));
		
		for(int i = 0; i < N; i++) {
			// 합 배열의 모든 값에 % 연수 수행하기
			int remainder = (int) (S[i] % M);
			
			// 0 ~ i까지의 구간 합 자체가 0일 때 정답에 더하기
			if( remainder == 0 )
				answer++;
			// 나머지가 같은 인덱스의 개수 카운팅하기
			C[remainder]++;
		}
		
		System.out.println("C[] ::: " + Arrays.toString(C));
		
		for(int i = 0; i < M; i++) {
			if( C[i] > 1 ) {
				// 나머지가 같은 인덱스 중 2개를 뽑는 경우의 수를 더하기
				answer = answer + (C[i] * (C[i] - 1) / 2);
				System.out.println("메롱메롱 :: " + (C[i] * (C[i] - 1) / 2));
			}		
		}
	}
}
