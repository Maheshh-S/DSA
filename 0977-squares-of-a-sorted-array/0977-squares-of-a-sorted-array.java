class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int l = 0 ;
        int r = n-1;

        int pos = n-1;

        while(l <= r){
            int ls = nums[l] * nums[l];
            int rs = nums[r] * nums[r];

            if(ls > rs){
                res[pos--] = ls;
                l++;
            }else{
                res[pos--] = rs;
                r--;
            }
        }
        return res;
    }
}