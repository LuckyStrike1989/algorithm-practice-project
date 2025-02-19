package com.backjoon.coding34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < N; i++) {
			String fileName = br.readLine();
			
			Pattern pattern = Pattern.compile("\\.([a-zA-Z0-9]+)$");
			Matcher matcher = pattern.matcher(fileName);
			
			if (matcher.find()) {
				String fileNameExt = matcher.group(1);
				map.put(fileNameExt, map.getOrDefault(fileNameExt, 0) + 1);
			}
		}
		
		LinkedHashMap<String, Integer> result = map.entrySet().stream().sorted((s1, s2) -> s1.getKey().compareTo(s2.getKey())).collect(LinkedHashMap::new, (m,e) -> m.put(e.getKey(), e.getValue()), Map::putAll);
		
		result.forEach((key, value) ->  System.out.println(key + " " + value));
		
	}
}
