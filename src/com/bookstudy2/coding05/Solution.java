package com.bookstudy2.coding05;

import java.util.Arrays;

public class Solution {
	/**
	 * Çà·ÄÀÇ °ö¼À
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int row_arr1 = arr1.length;
		int col_arr1 = arr1[0].length;
		int row_arr2 = arr2.length;
		int col_arr2 = arr2[0].length;
		
		int[][] result = new int[row_arr1][col_arr2];
		
		for(int i = 0; i < row_arr1; i++) {
			for(int j = 0; j<col_arr1; j++) {
				for(int k = 0; k<row_arr2; k++) {
					result[i][j] += (arr1[i][k] * arr2[k][j]);
				}
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[][] a1 = {
			{2,3,2},
			{4,2,4},
			{3,1,4}
		};
		
		int[][] a2 = {
			{5,4,3},
			{2,4,1},
			{3,1,1}
		};
		
		System.out.println(Arrays.deepToString(solution(a1, a2)));
	}
}
