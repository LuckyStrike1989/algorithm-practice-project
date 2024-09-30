package com.backjoon.coding19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		HashSet<Integer> hash = new HashSet<Integer>();
		
		for(int i=0; i<10; i++)
			hash.add((Integer.parseInt(br.readLine()) % 42));
		
		bw.write(String.valueOf(hash.size()));
		bw.flush();
		
		br.close();
		bw.close();
	}
}
