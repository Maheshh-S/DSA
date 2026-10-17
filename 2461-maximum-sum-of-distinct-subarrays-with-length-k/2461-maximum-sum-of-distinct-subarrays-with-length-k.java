class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long ans = 0;
        long sum = 0;
        int l = 0;

        HashSet<Integer> set = new HashSet<>();

        for(int r = 0 ; r < n ; r++){
            
            while(set.contains(nums[r])){
                sum -= nums[l];
                set.remove(nums[l]);
                l++;

            }

            set.add(nums[r]);
            sum += nums[r];

            if(r-l+1 == k){
                ans = Math.max(ans , sum);
                set.remove(nums[l]);
                sum -= nums[l];
                l++;
            }
        }
        return ans;
    }
}