class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        int n = arr.length;
        
        int low = 0;
        int high = n-1;
        int ans = -1;
        
        
        while(low <= high){
            
            int mid = low + (high - low) / 2;
            
            if(arr[mid] == k){ 
                
                ans = mid;
                high = mid -1;
            }else if(arr[mid] < k){
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return ans;
    }
}