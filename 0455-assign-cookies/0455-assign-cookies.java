class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int r = 0; // child pointer
        int l = 0; // cookie pointer
        int n = g.length;
        int m = s.length;

        int ans = 0;

        while (r < n && l < m) {
            if (g[r] <= s[l]) {
                ans++;
                r++;
                l++;
            } else {
                l++;
            }
        }
        return ans;
    }
}
