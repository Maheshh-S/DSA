class Solution {
    public int countSubarray(int[] arr, int k) {
        // code here
        int n = arr.length;
        
        int cnt = 0;
        int prod = 1;
        int l = 0;
        
        if(k <= 1) return 0;
        for(int i=0;i<n;i++){
            prod *= arr[i];
            while(prod >= k){
                prod /= arr[l];
                
                l++;
            }
            cnt += (i-l)+1;
            
        }
        return cnt;
    }
}