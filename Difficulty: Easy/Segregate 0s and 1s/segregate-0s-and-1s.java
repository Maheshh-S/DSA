// User function Template for Java

class Solution {
    void segregate0and1(int[] arr) {
        // code here
       int n = arr.length;
       int l = 0;
       int r = n-1;
       
       while(l < r){
           if(arr[l]==0){
               l++;
           }
          else if(arr[r] == 1){
               r--;
           }
           
           if(arr[r] == 0 && arr[l] ==1){
               int temp = arr[l];
               arr[l] = arr[r];
               arr[r] = temp;
               l++;
               r--;
           }
       }
    }
}
