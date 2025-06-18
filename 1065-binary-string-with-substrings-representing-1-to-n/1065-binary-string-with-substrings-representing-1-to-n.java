import java.util.*;
class Solution {
    public boolean queryString(String s, int n) {
        
            for(int i = 1; i<=n; i++){
        
        String Si = Integer.toBinaryString(i);

        if(!s.contains(Si)){
            return false;
        }
        }
            
return true;

    }
}