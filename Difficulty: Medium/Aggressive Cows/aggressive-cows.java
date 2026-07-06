class Solution {
    public int aggressiveCows(int[] arr, int k) {
        // code here
        
        
        Arrays.sort(arr);
        
        int low = 1;
        int n = arr.length;
        int h = arr[n-1] - arr[0];
        
        int ans = 0;
        
        while(low <= h){
            int mid = low + (h - low)/2;
            
            if (canPlace(arr , k , mid)){
                ans = mid;
                low = mid +1;
            }else{
                h = mid -1;
            }
        }
        return ans;
    }
    
    private boolean canPlace(int[] stalls , int k , int gap){
        int cnt = 1;
        
        int last = stalls[0];
        
        for(int i=1; i< stalls.length; i++){
            if(stalls[i] - last >= gap){
                cnt++;
                last = stalls[i];
            }
        }
        return cnt >= k;
    }
}