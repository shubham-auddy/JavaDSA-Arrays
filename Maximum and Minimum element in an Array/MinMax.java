package arrays;

import java.util.Scanner;

public class MaxMin {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i<n; i++) {
			if(arr[i] <= min) {
				min = arr[i];
			}
			if(arr[i] >= max) {
				max = arr[i];
			}
		}
		
		System.out.println("Minimum Value : "+min);
		System.out.println("Maximum Value : "+max);
		
		s.close();
	}

}
