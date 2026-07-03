class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int n = arr.length;
        int l = 0;
        int r = n-1;
        int ans = -1;
        
        while( l <= r){
            int mid = l+(r-l)/2;
            
            if(arr[mid] > x){
                r = mid -1;
            }else if(arr[mid] <= x){
                l = mid+1;
                ans = mid;
            }
        }
        return ans;
    }
}
