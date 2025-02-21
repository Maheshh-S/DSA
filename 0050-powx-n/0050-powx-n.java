class Solution {
    public double myPow(double a, int n) {
        double ans = 1.0;
        long exp = n; // Convert n to long to handle overflow

        if (exp < 0) {
            a = 1 / a;
            exp = -exp; // Convert negative exponent to positive
        }

        while (exp > 0) {
            if ((exp & 1) == 1) {
                ans *= a;
            }
            a *= a;  // Square the base
            exp >>= 1;  // Right shift the exponent
        }

        return ans;
    }
}
