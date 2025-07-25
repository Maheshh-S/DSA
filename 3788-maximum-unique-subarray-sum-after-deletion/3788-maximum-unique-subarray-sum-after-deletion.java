class Solution {
    public int maxSum(int[] nums) {
        
        boolean allneg = true;
        int maxv = Integer.MIN_VALUE;

        for(int n : nums){
            if(n >=0 ){
                allneg = false;
            }

            if( n > maxv){
                maxv = n;
            }
        }
       if(allneg){
        return maxv;
       }


       Set<Integer> uni = new HashSet<>();

       for(int n : nums){
        uni.add(n);
       }

       int sum = 0;
       for(int val : uni){
        if(val > 0){
            sum+=val;
        }
       }
        return sum;
    }
}