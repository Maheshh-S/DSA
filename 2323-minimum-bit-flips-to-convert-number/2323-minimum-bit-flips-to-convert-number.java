class Solution {
    public int minBitFlips(int start, int end) {
        int n = start ^ end;
        int count = 0;

        while(n != 0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
}