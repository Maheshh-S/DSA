class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int n = arr.length;
        int l =0;
        int zeroCnt = 0;
        
        for(int i = 0 ; i < n; i++){
            if(arr[i] == 0){
                zeroCnt++;
            }
            
            if(zeroCnt > k){
                if(arr[l] == 0){
                    zeroCnt--;
                }
                l++;
            }
        }
        return (n-l);
        
        
    }
}