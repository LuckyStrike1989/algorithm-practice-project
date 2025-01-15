package com.inflearn.study07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	final static int MAX = 100 + 10;
	static boolean[][] graph;
	static boolean[] visited;
	static int N, M, start, end, answer;
	
	public static void dfs(int idx, int count) {
		visited[idx] = true;
		if( idx == end ) {
			answer = count;
			return;
		}
		
		for(int i = 1; i <= N; i++)
			if(visited[i] == false && graph[idx][i])
				dfs(i, count + 1);
	}
	
	public static void main(String[] args) throws  IOException{
		// 0. �Է� �� �ʱ�ȭ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		start = Integer.parseInt(st.nextToken());
		end = Integer.parseInt(st.nextToken());
		
		M = Integer.parseInt(br.readLine());
		
		// 1. graph�� ���� ���� ä���
		graph = new boolean[MAX][MAX];
		visited = new boolean[MAX];
		answer = -1;
		
		int x, y;
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			graph[x][y] = true;
			graph[y][x] = true;
		}
		
		// 2. dfs(����Լ� ȣ��)
		dfs(start, 0);
		
		// 3. ���
		bw.write(String.valueOf(answer));
		
		bw.close();
		br.close();
	}
}
