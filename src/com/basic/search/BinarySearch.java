
package com.basic.search;

public class BinarySearch {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println(binarySearch(numbers, 4));
	}
	
	public static int binarySearch(int[] a, int key) {
		int mid;
		int low = 0;
		int high = a.length;
		
		while(low <= high) {
			mid = (low + high) / 2;
			if( key == a[mid] ) {
				return mid;
			} else if( key < a[mid] ) {
				high = mid - 1;
			} else {
				low = low + 1;
			}
		}
		
		return -1;
	}
}
