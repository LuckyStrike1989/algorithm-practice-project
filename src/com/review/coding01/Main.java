package com.review.coding01;

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
		
		int N = Integer.parseInt(br.readLine());
		int[] numbers = new int[N];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}
		
		numbers = Arrays.stream(numbers).distinct().toArray();
		Arrays.sort(numbers);
		
		for(int number : numbers) {
			bw.append(String.valueOf(number) + "\n");
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}

