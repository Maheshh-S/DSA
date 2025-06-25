import java.util.*;

class Solution {
    double fractionalKnapsack(int[] val, int[] we, int W) {
        // code here
        
        double ratio[][] = new double[val.length][2];
        for(int i = 0 ; i < val.length; i++){
            
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)we[i];
            
        }
        
        Arrays.sort(ratio, Comparator.comparingDouble( o -> o[1]));
        int capacity = W;
        double finalval = 0;
        
        for(int i = ratio.length-1; i >= 0; i--){
        int idx = (int) ratio [i][0];
        
        if(capacity >= we[idx]){
            
            finalval += val[idx];
            capacity -= we[idx];
        }else{
            finalval += ( ratio[i][1] * capacity) ; 
            capacity = 0;
            break;
            
        }
        }
        return finalval;
    }
}