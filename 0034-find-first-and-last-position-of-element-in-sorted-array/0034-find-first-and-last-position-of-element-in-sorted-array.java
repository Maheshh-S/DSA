class Solution {
    public int[] searchRange(int[] nums, int target) {
          int n = nums.length;
          int LB = Integer.MAX_VALUE;
          int UB = -1;
          for(int i = 0 ; i < n ; i++){
            if(nums[i] == target){
                 LB = Math.min(i , LB);
                 UB = Math.max( i , UB);
            }
          }
          if(LB == Integer.MAX_VALUE) LB = -1;
          return new int[]{LB , UB};
    }
}