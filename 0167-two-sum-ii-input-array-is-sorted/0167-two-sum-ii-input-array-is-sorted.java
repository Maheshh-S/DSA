class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        int l = 0;
        int r = n-1;
      

        while(r > l){
            sum = nums[r] + nums[l];
            if(sum == target){
               break;
            }
            
            if(sum > target){
                r--;
            }
            if(sum < target){
                l++;
            }
        }
         int[] ans = {l+1, r+1};
               return ans;
    }
}