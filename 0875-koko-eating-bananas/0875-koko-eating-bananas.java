class Solution {
    public int minEatingSpeed(int[] nums, int h) {
    
    int low = 1;
    int high = 0;

    for(int num : nums){
        high = Math.max(high , num);
    }

    int ans = high;

    while(low <= high){
        int mid = low + ( high - low) /2;
        if(canEat(nums , h , mid)){
            ans = mid;
            high = mid -1;
        }else{
            low = mid +1;
        }
    }
        return ans;
    }

    public boolean canEat(int[] nums, int h, int k){
        long hrs = 0;
        for(int p : nums){
            hrs += (p + k - 1)/k;
        }
        return hrs <= h;
    }
}