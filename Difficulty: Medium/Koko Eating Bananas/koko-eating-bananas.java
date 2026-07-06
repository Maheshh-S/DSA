class Solution {
    public int kokoEat(int[] arr, int k) {
        // code here
        
        int low = 1;
        int high = 0;
        
        for(int a : arr){
            high = Math.max(a , high);
        }
        
        int ans = high;
        
        while( low <= high){
            int mid = low + (high - low)/2;
            
             long hrs = 0;
            
            for(int p : arr){
                hrs += (p+mid-1)/mid;
            }
            
            
            if(hrs <= k){
                ans = mid;
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
        return ans;
    }
    // private boolean canEat(int[] nums , int h, int k){
        
            
    //         return hrs <= h
    // }
}
