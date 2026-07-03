class Solution {
    public int peakElement(int[] arr) {
        // code here
        int n = arr.length;
        
        int l=0 , r = n-1;
        
        while( l < r){
            int mid = l + (r-l)/2;
            
            if(arr[mid] > arr[mid+1]){
                r = mid;
            }else{
                l = mid +1;
            }
        }
        return l;
    }
}