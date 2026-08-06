class Solution {
    public int climbStairs(int n) {
        int prev1 = 1;
        int prev2 = 2;
    if(n < 3){
        return n;
    }
        for(int i=2; i < n ;i++){
            int temp = prev2+ prev1;
            prev1 = prev2;
            prev2 = temp;
        }
        return prev2;
    }
}