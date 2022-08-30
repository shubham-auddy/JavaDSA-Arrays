class MaxProd {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        int max = arr[0];
        int min = arr[0];
        int ans = arr[0];
        
        for(int i = 1; i<n ; i++){
            int temp = max;
            max = Math.max(arr[i], Math.max(arr[i]*max, arr[i]*min));
            min = Math.min(arr[i], Math.min(arr[i]*temp, arr[i]*min));
            
            ans = Math.max(max,ans);
        }
        return ans;
    }
}