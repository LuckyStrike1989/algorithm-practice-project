package com.backjoon.coding37;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = null;
		
		while( true ) {
			String s = br.readLine();
			
			if( "0".equals(s) ) {
				bw.flush();
				
				br.close();
				bw.close();
				break;
			} else {
				sb = new StringBuilder(s).reverse();
				String result = ( s.equals(sb.toString()) ) ? "yes" : "no";
				bw.append(result + "\n");
			}
		}
	}
}
