package com.lucky.coding02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		Integer[] scores = new Integer[n];
		double[] fixScores = new double[n];
		
		for(int i = 0; i<n; i++)
			scores[i] = scan.nextInt();

		// 내림차순 정렬
		Arrays.sort(scores, Comparator.reverseOrder());
		
		int maxScore = scores[0];
		
		int sumScore = 0;
		for(int i = 0; i<n; i++) {
			fixScores[i] = ((double)scores[i] / maxScore) * 100;
			sumScore += fixScores[i];
		}
		
		double result = sumScore / n;
		
		System.out.println(result);
	}
}
