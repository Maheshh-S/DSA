class Solution {

    public int maxDistance(String s, int k) {

        int n = s.length(), cntE = 0, cntW = 0, cntN = 0, cntS = 0, ans = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'E')
                cntE++;

            else if (c == 'W')
                cntW++;
            else if (c == 'N')
                cntN++;

            else if (c == 'S')
                cntS++;

            int j = i + 1, baseNE = (cntE + cntN) - (cntW + cntS), harmNE = cntW + cntS,
                    candNE = baseNE + 2 * Math.min(k, harmNE);

            int baseNW = (cntW + cntN) - (cntE + cntS), harmNW = cntE + cntS, candNW = baseNW + 2 * Math.min(k, harmNW);

            int baseSE = (cntE + cntS) - (cntW + cntN), harmSE = cntW + cntN, candSE = baseSE + 2 * Math.min(k, harmSE);

            int baseSW = (cntW + cntS) - (cntE + cntN), harmSW = cntE + cntN, candSW = baseSW + 2 * Math.min(k, harmSW);

            int bestForPrefix = Math.max(Math.max(candNE, candNW), Math.max(candSE, candSW));

            bestForPrefix = Math.max(bestForPrefix, 0);

            bestForPrefix = Math.min(bestForPrefix, j);

            ans = Math.max(ans, bestForPrefix);
        }

        return ans;
    }
}