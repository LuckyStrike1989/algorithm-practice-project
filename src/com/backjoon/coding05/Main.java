package com.backjoon.coding05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next().toUpperCase();
		
		char[] items = word.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char item : items) {
			Integer count = map.get(item);
			
			if( count == null ) {
				map.put(item, 1);
			} else {
				map.put(item, count + 1);
			}
		}
		
		int maxValue = 0;
		String result = "";
		for(Character key : map.keySet()) {
			
			if( maxValue == map.get(key) ) {
				result = "?";
			}
			
			if( maxValue < map.get(key) ) {
				maxValue = map.get(key);
				result = String.valueOf(key);
			}
		}
		
		System.out.println(result);
	}
}
