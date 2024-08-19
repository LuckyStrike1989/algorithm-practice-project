package com.backjoon.coding01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int C = Integer.parseInt(br.readLine());
		
		int hour = (B+C) / 60;
		int minute = (B+C) % 60;
		
		A = ((A+hour) >= 24 ) ? (A+hour) - 24 : (A+hour);
		B = ((minute) >= 60) ? (minute) - 60 : (minute);
		
		System.out.println(A + " " + B);
	}
}
