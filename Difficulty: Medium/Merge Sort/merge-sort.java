//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            new Solution().mergeSort(arr, 0, arr.length - 1);

            for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

            System.out.println();

            System.out.println("~");
        }
    }
}

// } Driver Code Ends

class Solution {

    void mergeSort(int arr[], int l, int r) {
        if(l>=r){
            return;
        }
        int halfSize = (l+r)/2;
        mergeSort(arr, l, halfSize);
        mergeSort(arr, halfSize+1, r);
        arr= mergeNumbers(arr, l , r);
    }
    
    static int[] mergeNumbers(int[] arr, int l, int r) {
        {
        // only one level backtracking, if both are same compare it. if not mismatched keys are already sorted
        int halfSize = (l + r) / 2;
        ArrayList<Integer> tempList = new ArrayList<>();
        
            int second = halfSize + 1;
            int first = l;
            while (second <= r) {
                if (first <= halfSize) {
                    if(arr[second]<arr[first]){
                        tempList.add(arr[second]);
                        second++;
                    }else{
                        tempList.add(arr[first]);
                        first++;
                    }
                }else{
                    tempList.add(arr[second]);
                    second++;
                }
            }
            if(second>=r ){
                while (first<=halfSize) {
                    tempList.add(arr[first]);
                    first++;
                }
            }

        // transfer tempList into arr
        int tempCount = l;
        for (int i = 0; i < tempList.size(); i++) {
            arr[tempCount] = tempList.get(i);
            tempCount++;
        }
        return arr;
        }
    }
}
 