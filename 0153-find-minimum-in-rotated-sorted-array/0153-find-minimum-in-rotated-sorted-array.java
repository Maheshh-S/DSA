class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        // int ans = Integer.MAX_VALUE;
        int l = 0;
        int r = n-1;

        while(l < r){

            int mid = l +(r-l)/2;

            if(nums[mid] <= nums[r]){
                r = mid;
            }else{
                l = mid +1;
            }
        }
        return nums[r];
    }
}