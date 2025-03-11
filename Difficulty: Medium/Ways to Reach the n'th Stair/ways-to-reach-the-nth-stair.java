//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {

        // taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        // taking total testcases
        int t = sc.nextInt();

        while (t-- > 0) {

            // taking count of stairs
            int m = sc.nextInt();

            // creating an object of class DynamicProgramming
            Solution obj = new Solution();

            // calling method countWays() of class
            // DynamicProgramming
            System.out.println(obj.countWays(m));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    int count(int n,int []dp){
        if(n==1||n==0)return 1;
        
        if(dp[n-1]!=-1)return dp[n-1];
        
        return dp[n-1]=count(n-1,dp)+count(n-2,dp);
    }
    int countWays(int n) {
        // your code here
        int []dp=new int [n];
    Arrays.fill(dp,-1);
    return count(n,dp);
    }
}
