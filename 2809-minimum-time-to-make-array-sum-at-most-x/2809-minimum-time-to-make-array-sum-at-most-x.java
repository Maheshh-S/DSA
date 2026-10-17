import java.util.Arrays;
import java.util.List;

class Solution {
    public int minimumTime(List<Integer> nums1, List<Integer> nums2, int x) {
        int n = nums1.size();
        int[][] pairs = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums1.get(i);
            pairs[i][1] = nums2.get(i);
        }
        
        // Sort pairs based on their growth rate (nums2)
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));
        
        int[] dp = new int[n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j >= 1; j--) {
                dp[j] = Math.max(dp[j], dp[j - 1] + pairs[i][0] + j * pairs[i][1]);
            }
        }
        
        long sum1 = 0;
        long sum2 = 0; // Fixed: Added missing semicolon
        
        for (int val : nums1) sum1 += val;
        for (int val : nums2) sum2 += val; // Fixed: Actually populate sum2
        
        for (int t = 0; t <= n; t++) {
            // Fixed: Changed 'sum' to 'sum2'
            if (sum1 + (long) t * sum2 - dp[t] <= x) {
                return t;
            }
        }
        
        return -1; // Fixed: Changed String "-1;" to integer -1
    }
}
