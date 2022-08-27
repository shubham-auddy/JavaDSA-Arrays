class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        
    //   BRUTE FORCE ---- O(n^2)   
    
    //   int maxsum = 0;
    //   for(int i = 0; i<n;i++){
    //       int sum = 0;
    //       for(int j = i; j<n; j++){
    //           sum += arr[j];
    //           //System.out.println(sum);
    //           if(sum>maxsum)
    //             maxsum = sum;
    //       }
    //   }
    //     return maxsum;
    
    
    // KADANE'S ALGO ---- O(n)
    
    int maxsum = Integer.MIN_VALUE;
    int cursum = 0;
    
    for(int i = 0; i<n; i++){
        cursum += arr[i];
        if(cursum>maxsum)
        maxsum = cursum;
        
        if(cursum<0)
        cursum = 0;
    }
    
    return maxsum;
    }
    
}