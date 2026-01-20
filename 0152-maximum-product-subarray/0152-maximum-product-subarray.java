class Solution {
    public int maxProduct(int[] nums) {
        

        int n = nums.length;

        int min = nums[0];
        int max = nums[0];
        int res = nums[0];

        for(int i = 1;i<n;i++){

            int v1 = nums[i];

            int v2 = nums[i] * min;

            int v3 = nums[i] * max;

            min = Math.min(v1 , Math.min(v2 , v3));

            max = Math.max(v1 , Math.max(v2 , v3));

            res = Math.max(res , Math.max(min , max));

        }
        return res;
    }
}