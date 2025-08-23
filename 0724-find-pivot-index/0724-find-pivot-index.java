class Solution {
    public int pivotIndex(int[] nums) {
        
        int t = 0;
         for(int num : nums){
            t += num;
         }

         int ls = 0;

         for(int i = 0; i < nums.length; i++){
            int rightsum = t - ls - nums[i];

            if(rightsum == ls){
                return i;
            } 
            ls += nums[i];
         }
return -1;

    }
}