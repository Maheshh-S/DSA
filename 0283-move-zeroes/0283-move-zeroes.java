class Solution {
    public void moveZeroes(int[] nums) {
       int nonzero = 0;
        int n = nums.length;
       for(int i=0;i<n;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[nonzero];
                nums[nonzero] = temp;
                nonzero++;
            }
       }
    }
}