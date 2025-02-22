//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String S = in.readLine();

            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
    static int maxLength(String S) {
        // code here
        Stack<Integer> s = new Stack<>();
        int ans = 0;
        s.push(-1);
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            
            if(c=='('){
                s.push(i);
            }else{
                s.pop();
                if(s.isEmpty()){
                    s.push(i);
                }else{
                    ans = Math.max(ans,i-s.peek());
                }
            }
        }
        
        return ans;
    }
}