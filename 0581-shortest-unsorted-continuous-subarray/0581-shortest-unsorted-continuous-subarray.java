class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        
        int[] temp = nums.clone();
        Arrays.sort(nums);

        int l =0;
        while(l < n && nums[l] == temp[l]) l++;

        int end = n-1;
        while(end > l && nums[end] == temp[end]) end--;

        return end - l +1;
    }
}