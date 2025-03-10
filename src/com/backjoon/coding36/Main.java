package com.backjoon.coding36;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		List<String> list = new ArrayList<>();
		
		int number1 = Integer.parseInt(st.nextToken());
		int number2 = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < number1; i++) {
			list.add(br.readLine());
		}
		
		for(int i = 0; i < number2; i++) {
			list.add(br.readLine());
		}
		
		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		List<String> mapToList = map.entrySet().stream().filter(entry -> entry.getValue() >= 2).map(Map.Entry::getKey).collect(Collectors.toList());
		
		List<String> result = mapToList.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
		
		// 결과
		System.out.println(result.size());
		for(String s : result)
			System.out.println(s);
		
		br.close();
	}
}
