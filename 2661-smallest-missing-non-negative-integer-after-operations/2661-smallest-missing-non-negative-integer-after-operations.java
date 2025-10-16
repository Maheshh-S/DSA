class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int[] remainderCnt = new int[value];

        for(int num : nums){
            int rem = ((num % value) + value) % value;
            remainderCnt[rem]++;
        }

        int res = 0;
        while(remainderCnt[res % value] > 0){
            remainderCnt[res% value] --;
            res++;
        }
        return res;
    }
}