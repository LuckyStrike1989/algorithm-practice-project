package com.backjoon.coding22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		String[] words = new String[N];
		for(int i=0; i<N; i++) {
			words[i] = br.readLine();
		}
		
		char[] result = words[0].toCharArray();
		for(int i = 1; i<N; i++) {
			char[] c = words[i].toCharArray();
			for(int j = 0; j<c.length; j++) {
				if( result[j] != c[j] )
					result[j] = '?';
			}
		}
		bw.write(result, 0, result.length);
		
		bw.flush();
		br.close();
		bw.close();
	}
}
