package com.backjoon.coding20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		// 0. 기본 세팅 및 데이터 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		Map<String, Integer> words = new HashMap<String, Integer>();
		for(int i=0; i<N; i++) {
			String word = br.readLine();
			words.put(word, word.length());
		}
		
		String[] arrWords = new String[words.size()];

		int count = 0;
		for(Map.Entry<String, Integer> entry : words.entrySet()) {
			arrWords[count] = entry.getKey();
			count++;
		}
		
		// 1. 데이터 정렬
		Arrays.sort(arrWords, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if( s1.length() == s2.length() ) {
					// 단어 길이가 같을 경우
					return s1.compareTo(s2);
				} else {
					// 그 외의 경우
					return s1.length() - s2.length();
				}
			}
		});
		
		// 2. 데이터 출력
		for(String word : arrWords) {
			bw.write(word + "\n");
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}
