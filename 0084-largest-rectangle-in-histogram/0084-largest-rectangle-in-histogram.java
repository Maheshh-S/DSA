import java.util.*;

class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int maxarea  = 0 ;
        int nsr[] = new int[n];
        int nsl[] = new int [n];

        //next smaller elem to the right

        Stack < Integer> s = new Stack<>();
        for(int i = n-1 ; i>=0; i--){

            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nsr[i] = n;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }


//next smaller lem to the left
s = new Stack<>();

 for(int i = 0; i<n; i++){

            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }


for(int i =0; i<n; i++){

    int hi = arr[i];
    int wi = nsr[i] - nsl[i] -1;
    int currArea = hi * wi;
    maxarea = Math.max(currArea , maxarea);
}
return maxarea;


    }
}