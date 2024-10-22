package com.algorithm.study01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		
		Map<String, Integer> map = new HashMap<>();
		
		for(String player : participant)
			map.put(player, map.getOrDefault(player, 0) + 1);
		
		for(String player : completion)
			map.put(player, map.get(player) - 1);
		
		for(Entry<String, Integer> entry : map.entrySet())
			if( entry.getValue() > 0 )
				answer = entry.getKey();
		
		/*Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
		
		while(iter.hasNext()) {
			Map.Entry<String, Integer> entry = iter.next();
			if( entry.getValue() > 0 ) {
				answer = entry.getKey();
				break;
			}
		}*/
		
		return answer;
	}
	
	public static void main(String[] args) {
		String[] part = {"leo", "kiki", "eden"};
		String[] comp = {"eden", "kiki"};
		Solution sol = new Solution();
		System.out.println(sol.solution(part, comp));
	}
}
