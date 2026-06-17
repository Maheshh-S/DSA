class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        
        int MinLen = Integer.MAX_VALUE;
        
        int n = arr.length;
        
        int CurrLen = 0;
        
        int l =0;
        
        int sum = 0;
        
        for(int r = 0 ; r < n; r++){
            sum += arr[r];
            
            while(sum > x){
                if(sum > x){
                    
                CurrLen = (r - l)+1;
                
                MinLen = Math.min(CurrLen , MinLen);
                
                }
                sum -= arr[l];
                l++;
            }
        }
        
        return MinLen == Integer.MAX_VALUE? 0 : MinLen;
    }
}
