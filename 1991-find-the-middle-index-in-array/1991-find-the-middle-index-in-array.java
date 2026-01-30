class Solution {
    public int findMiddleIndex(int[] nums) {
        
        int n = nums.length;

        int left = 0;
        int right = 0;
        int sum = 0;

        for(int num : nums){
            sum += num;
        }

        for(int i = 0 ; i < n ; i++){
            right = sum  - nums[i] - left;
        

        if(right == left ){
            return i;
        }

        left += nums[i];
        }
        return -1;
    }
}