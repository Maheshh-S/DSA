class Solution {
    public int minimumCost(int[] nums) {
        
        //see first i have to keep track for first omne alwayss
        //cuz i see that wile dividing into 3 parts i hve the first one 

        int r = 0;
        int n = nums.length;
        int sum = 0;
        
        
        int first = Integer.MAX_VALUE;
        int sec = Integer.MIN_VALUE;


for(int i = 1; i < n ; i++){
        int x = nums[i];
        if( x < first){
            sec = first;
            first = x;
        }else if(x < sec){
            sec = x;
        }
}

       sum = nums[0] + first + sec; 
        

    return sum;
    }
}