package com.backjoon.coding39;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<Integer, String> keyToValue = new HashMap<>();
		Map<String, Integer> valueToKey = new HashMap<>();
		
		for(int i = 1; i <= N; i++) {
			String pokemonName = br.readLine();
			keyToValue.put(i, pokemonName);
			valueToKey.put(pokemonName, i);
		}
		
		for(int i = 0; i < M; i++) {
			String input = br.readLine();
			
			if( input.matches("^\\d+$") ) {
				int number = Integer.parseInt(input);
				sb.append(keyToValue.get(number)).append("\n");
			} else {
				/*Integer key = pokemonList.entrySet().stream()
						.filter(entry -> entry.getValue().equals(findPokemon))
						.map(Map.Entry::getKey)
						.findFirst()
						.orElse(null);
				sb.append(key + "\n");*/
				sb.append(valueToKey.get(input)).append("\n");
			}
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}
}
