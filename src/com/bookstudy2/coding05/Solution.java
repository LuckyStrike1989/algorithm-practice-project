package com.bookstudy2.coding05;

import java.util.Arrays;

public class Solution {
	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int x_arr1 = arr1[0].length;
		int y_arr1 = arr1.length;
		int x_arr2 = arr2[0].length;
		int y_arr2 = arr2.length;
		
		int[][] result = new int[y_arr1][x_arr2];
		
		for(int i = 0; i<y_arr1; i++) {
			for(int j = 0; j<x_arr2; j++) {
				// result[i][j] += (arr1[i][j] * arr2[j][i]);
				// System.out.println(arr1[i][j] * arr2[j][i]);
				System.out.println(i + "/" + j);
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[][] a1 = {
			{1,4},
			{3,2},
			{4,1}
		};
		
		int[][] a2 = {
			{3,3},
			{3,3}
		};
		
		System.out.println(Arrays.toString(solution(a1, a2)));
	}
}
