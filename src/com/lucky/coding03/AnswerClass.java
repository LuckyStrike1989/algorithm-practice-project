package com.lucky.coding03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AnswerClass {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		// 데이터의 개수
		int suNo = Integer.parseInt(stringTokenizer.nextToken());
		// 질의 수
		int quizNo = Integer.parseInt(stringTokenizer.nextToken());
		// 구갑합 배열
		long[] S = new long[suNo + 1];
		
		// 구간 합을 구할 대상 배열 데이터
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		// 구간 합을 배열 S에 미리 계산 하여 입력
		for(int i = 1; i <= suNo; i++) {
			S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
		}
		
		for(int q = 0; q < quizNo; q++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			
			// 시작 구간
			int i = Integer.parseInt(stringTokenizer.nextToken());
			// 종료 구간
			int j = Integer.parseInt(stringTokenizer.nextToken());
			
			// 결과
			System.out.println(S[j] - S[i-1]);
		}
	}
}
