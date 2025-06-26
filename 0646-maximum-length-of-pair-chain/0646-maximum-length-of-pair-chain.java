class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
int n = pairs.length;
        int ans = 1;
        int chainEnd = pairs[0][1];

        for (int i = 0; i < n; i++) {

            if (pairs[i][0] > chainEnd) {
                ans++;
                chainEnd = pairs[i][1];

            }
        }
        return ans;

    }
}