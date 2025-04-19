
import java.util.Arrays;

class Solution {
    // Function to find the lower bound using binary search
    public int lower_bound(int ar[], int start, int end, int val) {
        int ret = end + 1;  // Initialize to one past the end
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int target = ar[mid];
            
            if (target < val) {
                start = mid + 1;
            } else {
                ret = mid;
                end = mid - 1;
            }
        }
        
        return ret;
    }
    
    // Function to find the upper bound using binary search
    public int upper_bound(int ar[], int start, int end, int val) {
        int ret = end + 1;  // Initialize to one past the end
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int target = ar[mid];
            
            if (target <= val) {
                start = mid + 1;
            } else {
                ret = mid;
                end = mid - 1;
            }
        }
        
        return ret;
    }
    
    // Main function to count fair pairs
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);  // Sort the array
        
        long res = 0;
        int n = nums.length;
        
        // For each element, find all valid partners
        for (int i = 0; i < n; ++i) {
            int x = nums[i];
            
            // Check valid range for nums[j] using binary search
            int lowerBoundIdx = lower_bound(nums, i + 1, n - 1, lower - x);
            int upperBoundIdx = upper_bound(nums, i + 1, n - 1, upper - x);
            
            // Add the number of valid pairs
            if (lowerBoundIdx <= n - 1) {
                res += (upperBoundIdx - lowerBoundIdx);
            }
        }
        
        return res;
    }
}