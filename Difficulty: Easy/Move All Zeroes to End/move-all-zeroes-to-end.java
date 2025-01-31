//{ Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().pushZerosToEnd(arr);
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n = arr.length;
        int j = -1;
        // Find the first occurrence of 0
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i; // First zero position
                break;
            }
        }
        // If there are no zeros, return as array is already correct
        if (j == -1) {
            return;
        }
        // Move non-zero elements forward
        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                // Swap arr[j] and arr[i]
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++; // Move j to the next position
            }
        }
    }
}