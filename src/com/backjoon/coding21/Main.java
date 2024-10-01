package com.backjoon.coding21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static int N;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<MemberVO> members = new ArrayList<>();
		
		N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			
			members.add(new MemberVO(age, name));
		}
		
		Collections.sort(members, new Comparator<MemberVO>() {
			@Override
			public int compare(MemberVO o1, MemberVO o2) {
				return o1.age - o2.age;
			}
		});
		
		for(MemberVO member : members) {
			bw.write(String.valueOf(member.getAge()) + " " + member.getName());
			bw.newLine();
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
	
	public static class MemberVO {
		private int age;
		private String name;
		
		public MemberVO() {}
		
		public MemberVO(int age, String name) {
			this.age = age;
			this.name = name;
		}
		
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
}
