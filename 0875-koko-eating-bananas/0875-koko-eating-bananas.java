class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int n = piles.length;
        int r = 0;
        for(int num : piles){
            r = Math.max(num , r);
        }
        int ans = r;    

        while( l <= r){
            int mid = l + ( r- l)/2;

            if(canEat(piles , h , mid)){
                ans = mid;
                r = mid-1;
            }else{
                l = mid +1;
            }
        }
        return ans;
    }

    private boolean canEat(int[] nums , int h , int k){
        long hr = 0;

        for(int p : nums){
            hr += (p + k-1)/k;
        }

        return hr <= h;
    }
}