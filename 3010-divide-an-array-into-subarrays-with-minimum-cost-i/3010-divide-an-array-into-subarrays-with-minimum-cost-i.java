class Solution {
    public int minimumCost(int[] nums) {
        
        //see first i have to keep track for first omne alwayss
        //cuz i see that wile dividing into 3 parts i hve the first one 

        int r = 0;
        int n = nums.length;
        int sum = 0;
        Arrays.sort(nums, 1, n);
            sum = nums[r]+ nums[1] + nums[2];

        
        

    return sum;
    }
}