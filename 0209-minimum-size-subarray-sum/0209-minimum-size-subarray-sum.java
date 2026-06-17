class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int l =0;
        int minLen = Integer.MAX_VALUE;
        int CurrLen = 0;
        int sum = 0;

        for(int i=0;i <n;i++){
            sum += nums[i];

           

            while(sum >= target){
                if(sum >= target){
            CurrLen = i - l +1;
            minLen = Math.min(CurrLen , minLen);
            }
                sum -= nums[l];
                l++;

                
            }

        }
        
        return minLen == 2147483647 ? 0 : minLen;
    }
}