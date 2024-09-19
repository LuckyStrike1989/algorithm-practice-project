package com.backjoon.coding18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String S = br.readLine();
		char[] c = S.toCharArray();
		
		Arrays.sort(c);
		
		bw.write(sb.append(c).reverse().toString());
		
		bw.flush();
		
		bw.close();
		br.close();
	}
}
