class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int n = arr.length;
        int cnt0 = 0;
        int cnt1 = 0;
        int max0 = 0;
        int max1 = 0;
        
        
        for(int i = 0; i < n;i++){
            if(arr[i] == 0){
                cnt0++;
                cnt1=0;
            }else{
                cnt0=0;
                cnt1++;
            }
            
           max0 =  Math.max(max0 , cnt0);
                      max1 =  Math.max(max1 , cnt1);

            
        }
        
        return Math.max(max0 , max1);
    }
}
