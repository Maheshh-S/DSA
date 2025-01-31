class Solution {
    public int missingNumber(int[] nums) {
      int sum = 0;
      int n = nums.length;

      sum = n*(n+1)/2;

      int totalsum = 0;
      for(int i = 0; i < nums.length; i++){
        totalsum += nums[i];
      }
      return sum - totalsum;

    }
}