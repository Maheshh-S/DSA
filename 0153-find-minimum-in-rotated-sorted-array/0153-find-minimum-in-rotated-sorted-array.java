class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            ans = Math.min(ans , nums[i]);
        }
        return ans;
    }
}