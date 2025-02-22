class Solution {
    public int minFlips(int a, int b, int c) {
        int flips = 0;

        while (a > 0 || b > 0 || c > 0) {
            int bit_a = a & 1;
            int bit_b = b & 1;
            int bit_c = c & 1;

            if (bit_c == 0) {
                flips += (bit_a + bit_b);  // If c's bit is 0, count all 1s in a and b
            } else {
                if (bit_a == 0 && bit_b == 0) {
                    flips += 1;  // If c's bit is 1, at least one of a or b must be 1
                }
            }

            a >>= 1;
            b >>= 1;
            c >>= 1;
        }

        return flips;
    }
}
