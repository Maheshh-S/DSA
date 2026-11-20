class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long ans = 0;
        long sum = 0;
        int l = 0;
//we need a set to store the unique elements from the array
        HashSet<Integer> set = new HashSet<>();
//As usual we move the right pointer
        for(int r = 0 ; r < n ; r++){
   //If set contains this Right element, then we know we need a unique element. So we will remove it from this sum and also set, and until unless it is removed, we'll shrink         
            while(set.contains(nums[r])){
                sum -= nums[l];
                set.remove(nums[l]);
                l++;

            }

            set.add(nums[r]);
            sum += nums[r];
//According to the question, if the length of the unique integer is equal to k, then we calculate and shrink one time
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