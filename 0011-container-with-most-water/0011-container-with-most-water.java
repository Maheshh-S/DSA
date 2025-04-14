class Solution {
    public int maxArea(int[] arr) {
        
        int lp = 0;
        int rp = arr.length-1;

        int maxwater = 0;

        while(lp < rp){
            int ht = Math.min(arr[lp], arr[rp]);
            int wdt = rp - lp;
                    int area  = ht*wdt;
        maxwater = Math.max(area, maxwater);

                if(arr[lp] < arr[rp]){
                        lp++;
                }else{
                    rp--;
                }

        }
return maxwater;
    }
}