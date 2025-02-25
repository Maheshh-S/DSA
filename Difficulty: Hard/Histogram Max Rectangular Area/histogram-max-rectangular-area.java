//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

class Solution {
    public static int prevSmaller(int []arr , int i){
        for(int j = i ; j >= 0 ; j--){
            if(arr[i] > arr[j]){
                return j ; 
            }
        }
        return  -1 ;
    }
    public static int nextsmaller(int []arr ,int i){
        for(int j = i ; j<arr.length ; j++){
            if(arr[i] > arr[j]){
                return j ; 
            }
        }
        return arr.length ; 
    }
    public static int getMaxArea(int arr[]) {
        // your code here
        int rec = 0 ; 
        int larRec = 0   ;    
        for(int i = 0 ; i < arr.length ; i++){
            int nextSmall = nextsmaller(arr , i)  ;
            int prevSmall = prevSmaller(arr , i) ; 
            int area = nextSmall - prevSmall -1 ; 
            rec = arr[i] * area ; 
            larRec = Math.max(rec , larRec) ; 
        }
        return larRec ; 
    }
}



//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int res = obj.getMaxArea(arr);

            System.out.println(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends