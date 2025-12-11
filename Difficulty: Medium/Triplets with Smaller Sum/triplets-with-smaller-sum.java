// User function Template for Java
import java.util.*;
class Solution {
    long countTriplets(int n, int sum, long arr[]) {
        
        // given trplets are less then sum
        
        long add = 0;
        int count =0;
        Arrays.sort(arr);
    //   System.out.println(Arrays.toString(arr));
       //[1, 3, 6, 7, 8, 9, 10, 19, 20, 21, 23, 25, 26, 27, 28, 30, 31, 33]
       
        
        //. 1 3 33 - 33 3 1 - 1 33 3
        // int best = arr[0] + arr[1] + arr[2];
        
        for(int i=0;i<n-2;i++){
            int l=i+1;
            int r=n-1;
            
            while(l<r){
                
                add = arr[i] + arr[l] + arr[r];
                if(add < sum){
                  count += (r - l);
 
                //   l++;
                   l++;
                }else{
                    r--;
                }
            }
        }
        return count;
        
    }
}
