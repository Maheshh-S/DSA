class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int w = 0;
        
        // Initial count of 'W' in the first window
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') w++;
        }
        
        int ans = w;
        
        // Sliding Window
        for (int i = k; i < n; i++) {
            if (blocks.charAt(i) == 'W') w++;
            if (blocks.charAt(i - k) == 'W') w--;
            ans = Math.min(ans, w);
        }
        
        return ans;
    }
}