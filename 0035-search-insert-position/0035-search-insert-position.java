class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int n = nums.length;
        // if(target == 0) return target;
        // int l = 0;
        // int r = l+1;
// int r = 0;
       for(int l=0;l<n;l++){
            if(nums[l] >= target) return l;
        }
        return n;
    }
}