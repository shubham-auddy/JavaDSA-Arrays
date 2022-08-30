class FindDuplicate {
    public int findDuplicate(int[] nums) {
        
        int n = nums.length;
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i= 0; i<n; i++){
            int x = nums[i];
            if(set.contains(x)){
                return x;
            }
            set.add(x);
        }
        
        return -1;     
    }
}