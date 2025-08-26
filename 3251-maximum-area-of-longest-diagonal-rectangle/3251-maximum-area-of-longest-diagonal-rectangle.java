class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        

        int n = dimensions.length;
        int mA = 0;
        int mD = 0;

        for(int i = 0; i < n ; i++){
            int l = dimensions[i][0];
            int w = dimensions[i][1];

            int currD = l*l + w*w;
            if(currD > mD || (currD == mD && l*w > mA)){
                mD = currD;
                mA = l*w;
            }
        }
        return mA;
    }
}