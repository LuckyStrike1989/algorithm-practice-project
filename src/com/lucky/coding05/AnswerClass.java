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
		
		// ������ ����
		int N = Integer.parseInt(st.nextToken());
		
		// ����������� �ϴ� ��(������ �ϴ� ��)
		int M = Integer.parseInt(st.nextToken());
		
		// �չ迭
		long[] S = new long[N];
		
		// ���� �������� �ε����� ī��Ʈ�ϴ� �迭
		long[] C = new long[M];
		
		// ����
		long answer = 0;
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			// ���� �� �迭 ����� ����
			if( i == 0 ) {
				S[i] = Integer.parseInt(st.nextToken());
			} else {
				S[i] = S[i-1] + Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.println("S[] ::: " + Arrays.toString(S));
		
		for(int i = 0; i < N; i++) {
			// �� �迭�� ��� ���� % ���� �����ϱ�
			int remainder = (int) (S[i] % M);
			
			// 0 ~ i������ ���� �� ��ü�� 0�� �� ���信 ���ϱ�
			if( remainder == 0 )
				answer++;
			// �������� ���� �ε����� ���� ī�����ϱ�
			C[remainder]++;
		}
		
		System.out.println("C[] ::: " + Arrays.toString(C));
		
		for(int i = 0; i < M; i++) {
			if( C[i] > 1 ) {
				// �������� ���� �ε��� �� 2���� �̴� ����� ���� ���ϱ�
				answer = answer + (C[i] * (C[i] - 1) / 2);
				System.out.println("�޷ո޷� :: " + (C[i] * (C[i] - 1) / 2));
			}		
		}
	}
}
