package com.inflearn.study02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	final static int MAX = 1000 + 10;
	static boolean graph[][];
	static boolean visited[];
	static int N, M;
	static int answer;
	
	static void dfs(int idx) {
		visited[idx] = true;
		for(int i=1; i<=N; i++) {
			if( visited[i] == false && graph[idx][i] )
				dfs(i);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		graph = new boolean[MAX][MAX];
		visited = new boolean[MAX];
		
		/*
		graph = new boolean[N+1][N+1];
		visited = new boolean[N+1];
		*/
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			graph[x][y] = true;
			graph[y][x] = true;
		}
		
		for(int i=1; i<=N; i++) {
			if(visited[i] == false) {
				dfs(i);
				answer++;
			}
		}
		
		bw.write(String.valueOf(answer));
		bw.flush();
		
		bw.close();
		br.close();
	}
}
