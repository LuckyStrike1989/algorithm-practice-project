package com.backjoon.coding37;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		while( true ) {
			String s = br.readLine();
			
			if( "0".equals(s) ) {
				bw.append(sb.toString());
				bw.flush();
				
				br.close();
				bw.close();
				break;
			} else {
				char[] cArr = s.toCharArray();
				
				int start = 0;
				int end = cArr.length-1;
				
				String yesNo = "yes";
				for(int i = 0; i < cArr.length; i++) {
					if( cArr[start + i] != cArr[end - i] ) {
						yesNo = "no";
						break;
					}
				}
				
				sb.append(yesNo + "\n");
			}
		}
	}
}
