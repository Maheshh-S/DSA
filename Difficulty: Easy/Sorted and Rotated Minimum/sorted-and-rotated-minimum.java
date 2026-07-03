class Solution {
    public int findMin(int[] arr) {
        // code here
        int n = arr.length;
        
        int l = 0;
        int r = n-1;
        
        while( l < r){
            int mid = l + ( r-l )/2;
            
            if(arr[mid] <= arr[r]){
                r = mid;
            }else{
                l = mid+1;
            }
        }
        return arr[r];
    }
}
