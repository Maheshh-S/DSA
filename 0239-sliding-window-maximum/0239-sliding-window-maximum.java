import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k == 0) return new int[0];
        
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> dq = new LinkedList<>(); // stores indices
        int ri = 0;

        for (int j = 0; j < n; j++) {
            // Remove indices out of the current window
            while (!dq.isEmpty() && dq.peekFirst() < j - k + 1) {
                dq.pollFirst();
            }

            // Remove elements smaller than current
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[j]) {
                dq.pollLast();
            }

            dq.offerLast(j);

            if (j >= k - 1) {
                result[ri++] = nums[dq.peekFirst()];
            }
        }

        return result;
    }
}
