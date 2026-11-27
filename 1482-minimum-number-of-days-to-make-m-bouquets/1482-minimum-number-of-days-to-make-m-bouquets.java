class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if((long) m*k > n) return -1;

        int low = 1;
        int high = (int)1e7;

        int res = -1;

        for(int b : bloomDay){
            low = Math.min(b , low);
            high = Math.max(b , high);
        }

        while( low <= high){
            int mid = low + (high - low )/2;

            if(canMake(bloomDay, m , k , mid)){
                res = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return res;
    }

    private boolean canMake(int[] bloomDay , int m , int k, int day){
        int consecutive = 0;
        int bou = 0;

        for(int bloom : bloomDay){

            if(bloom <= day){
                consecutive++;

                if(consecutive == k){
                    bou++;
                    consecutive=0;
                }
            }else{
                consecutive = 0;
            }
        }
        return bou >= m;
    }
}

/* 

bloomDay m and k
m bo ; k adj flowers
n - flowers
ith = bloomDay

can be used only once

min num of days
to make m bou 

l = 1;
h = max


 */