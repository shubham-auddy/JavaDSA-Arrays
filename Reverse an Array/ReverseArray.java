package arrays;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		// INPUT ARRAY
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		
		System.out.println("INITIAL ARRAY: ");
		printArray(arr, n);
		
		reverseArray(arr, n);
		
		System.out.println("REVERSED ARRAY: ");
		printArray(arr, n);
		
		s.close();

	}
	
	// PRINTING ARRAY
	public static void printArray(int[] arr, int n) {
		
		for(int i = 0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	// REVERSE ARRAY FUNCTION
	public static void reverseArray(int[] arr, int n) {
		int start = 0;
		int end = n-1;
		
		while(start<end) {
			swap(arr, start, end);
			start++;
			end--;
		}
	}

	// SWAP FUNCTION
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
