class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int n = arr.length;
        
        int l = 0 ; 
        int r = n-1;
        int ll =-1;
        int rr = 0;
        
        while( l <= r){
            int mid = l + (r-l)/2;
            
            if(arr[mid] == target){
                ll = mid;
                r = mid-1;
            }else if(arr[mid] < target){
                l = mid +1;
            }else{
                r= mid-1;
            }
        }
        if(ll == -1) return 0;
        l=0;
        r = n-1;
        
        while( l <= r){
            int mid = l + (r-l)/2;
            
            if(arr[mid] == target){
                rr = mid;
                l = mid+1;
            }else if(arr[mid] < target){
                l = mid +1;
            }else{
                r= mid-1;
            }
        }
        return rr-ll +1;
    }
}
