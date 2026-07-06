class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low =0;
        int high = 0;

        for(int w : weights){
            low = Math.max(w , low);
            high += w;
        }
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;

            if(canPlace(weights , days , mid)){
                ans = mid;
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
        return ans;
    }

    private boolean canPlace(int[] weights , int days , int mid){
        int curr = 0;
        int d = 1;

        for(int w : weights){
            curr += w;

            if(curr > mid){
                d++;
                curr = w;
            }

        }
        return d <= days;
    }
}