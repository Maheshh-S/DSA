class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        int m = arr.length;
        int planted = 0;

        for(int i = 0 ; i < m; i++){
            if(arr[i] == 0){
                boolean lempty = (i == 0) || (arr[i-1] == 0);
                boolean rempty = (i == m-1) || (arr[i+1] == 0);

                if(lempty && rempty){
                    arr[i] = 1;
                    planted++;
                    if(planted >= n){
                        return true;
                    }
                } 
            }
        }
        return planted >=n;
    }
}