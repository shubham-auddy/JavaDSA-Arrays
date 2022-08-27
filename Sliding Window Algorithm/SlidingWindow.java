package slidingWindow;

public class SlidingWindow {

	public static void main(String[] args) {
		// Find Max sum from the array:
		int[] arr = new int[] {4,1,3,5,1,2,3,2,1,1,5};
		int n = arr.length;
		int k = 3;
		
		int max = slidingWindow(arr, n, k);
		System.out.println(max);

	}
	
	static int slidingWindow(int[] arr, int n, int k) {
		
		if(n<k) {
			System.out.println("INVALID");
			return -1;
		}
		
		int currentSum = 0;
		
		for(int i = 0; i<k; i++) {
			currentSum += arr[i];
		}
		
		int windowSum = currentSum;
		for(int i = k; i<n;i++) {
			windowSum = windowSum + arr[i] - arr[i-k];
			currentSum = Math.max(windowSum, currentSum);
		}
		return currentSum;
	}

}
