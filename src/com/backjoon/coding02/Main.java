package com.backjoon.coding02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		List<String> items = new ArrayList<String>();
		
		while( st.hasMoreTokens() ) {
			items.add(st.nextToken());
		}
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		
		for(String item : items) {
			Integer count = map.get(item);
			
			if( count == null ) {
				map.put(item, 1);
			} else {
				map.put(item, count + 1);
			}
		}
		
		int intKey = 0;
		int result = 0;
		int duplicateKeyCount = 0;
		int maxItem = 0;
		for(String key : map.keySet()) {
			if( duplicateKeyCount <  map.get(key) ) {
				duplicateKeyCount = map.get(key);
				intKey = Integer.parseInt(key);
			}
			
			if( maxItem < Integer.parseInt(key) ) {
				maxItem = Integer.parseInt(key);
			}
			
		}
		
		if( duplicateKeyCount == 3 ) {
			result = 10000 + intKey * 1000;
		} else if( duplicateKeyCount == 2 ) {
			result = 1000 + intKey * 100;
		} else {
			result = maxItem * 100;
		}
		
		System.out.println(result);
		
	}
}
