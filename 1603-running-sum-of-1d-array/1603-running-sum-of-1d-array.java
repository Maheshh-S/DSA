class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int prifix[] = new int[n];

        prifix[0] = nums[0];
        for(int i =1;i<n;i++){
            prifix[i] = prifix[i-1] + nums[i];
        } 
        return prifix;
    }
}