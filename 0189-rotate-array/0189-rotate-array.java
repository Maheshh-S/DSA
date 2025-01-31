class Solution {
    public void rotate(int[] nums, int k) {
        // Ensure k is within bounds
        k = k % nums.length; 

        // Step 1: Reverse the entire array
        reverse(nums, 0, nums.length - 1);

        // Step 2: Reverse the first 'k' elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse the remaining elements
        reverse(nums, k, nums.length - 1);
    }

    // Helper function to reverse a portion of the array
    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}