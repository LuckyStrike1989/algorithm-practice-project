package com.programmers.coding04;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public static boolean solution(String[] phone_book) {
		boolean answer = true;
		
		Map<String, Integer> map = new HashMap<>();
		
		// Arrays.sort(phone_book);
		/*for(int i=1; i<phone_book.length; i++) {
			if( phone_book[i].contains(phone_book[0]) ) {
				answer = false;
				break;
			}
		}*/
		
		for(int i=0; i<phone_book.length; i++) {
			map.put(phone_book[i], i);
		}
		
		for(int i = 0; i<phone_book.length; i++){
			for(int j = 0; j<phone_book[i].length(); j++){
                if(map.containsKey(phone_book[i].substring(0,j))){
                    answer = false;
                }
            }
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		String[] phoneBook = {"119", "97674223", "1195524421"};
		
		System.out.println(solution(phoneBook));
	}
}
