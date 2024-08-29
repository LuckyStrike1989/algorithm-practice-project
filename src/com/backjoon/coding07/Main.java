package com.backjoon.coding07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		for(int i = 0; i<9; i++) {
			numbers.add(Integer.parseInt(br.readLine()));
		}
		
		int max = Collections.max(numbers);
		
		System.out.println(max);
		System.out.println(numbers.indexOf(max)+1);
	}
}
