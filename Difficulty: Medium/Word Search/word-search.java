//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt(); // Number of test cases
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            char[][] mat = new char[n][m];

            // Reading the matrix
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    mat[i][j] = sc.next().charAt(0);
                }
            }

            String word = sc.next();
            Solution obj = new Solution();
            boolean ans = obj.isWordExist(mat, word);
            if (ans)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
        sc.close();
    }
}
// } Driver Code Ends


class Solution {
    static public boolean isWordExist(char[][] mat, String word) {
        int n = mat.length, m = mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(solve(i,j,n,m,mat,0,word))  return true;
            }
        }
        return false;
    }
    static int dir[][] = {{0,-1},{0,1},{1,0},{-1,0}};
    static boolean solve(int i,int j,int n,int m,char a[][],int id,String word){
        if(id==word.length()) return true;
        if(i<0 || j<0 || i>=n || j>=m || word.charAt(id)!=a[i][j]) return false;
        char temp = a[i][j];
        a[i][j]='#';
        for(int d[]:dir){
            if(solve(i+d[0],j+d[1],n,m,a,id+1,word))    return true;
        }
        a[i][j] = temp;
        return false;
    }
}