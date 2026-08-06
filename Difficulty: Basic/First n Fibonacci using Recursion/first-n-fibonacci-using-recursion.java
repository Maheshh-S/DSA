class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        // // Your code here
        // int prev0 = 0;
        // int prev1 = 1;
        
        
        int ans[] = new int[n];
        
        // ans[0] = 0;
        // ans[1] = 1;
        
        if (n >= 1) {
            ans[0] = 0;
        }
        if (n >= 2) {
            ans[1] = 1;
        }
        
        for(int i=2;i<n;i++){
            ans[i] = ans[i-1] + ans[i-2];
            // int temp = prev0 + prev1;
            // prev0 = prev1;
            // prev1 = temp;
        }
        return ans;
    }
}