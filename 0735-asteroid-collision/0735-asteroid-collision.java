class Solution {
    public int[] asteroidCollision(int[] nums) {
        int n = nums.length;

        Stack<Integer> st = new Stack<>();

        for (int a : nums) {
            while (!st.isEmpty() &&
                    st.peek() > 0 &&
                    a < 0 &&
                    Math.abs(a) > st.peek()) {
                st.pop();
            }

            if (!st.isEmpty() && a < 0 && st.peek() > 0) {
                if (st.peek() == Math.abs(a)) {
                    st.pop();
                } 
                }else {
                    st.push(a);
            }
        }
        int[] ans = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
}