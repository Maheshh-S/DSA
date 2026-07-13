class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        int m = s.length();
        int n = t.length();

        int l = m-1;
        int r = n-1;

        int cnt1 = 0;
        int cnt2 = 0;

        while(l >= 0 || r >= 0){
            
            while(l >= 0){
                if(s.charAt(l) == '#'){
                    cnt1++;
                    l--;
                }else if(cnt1 > 0){
                    l--;
                    cnt1--;
                }else{
                    break;
                }
            }

            while(r >=0 ){
                if(t.charAt(r) == '#'){
                    cnt2++;
                    r--;
                }else if( cnt2 > 0){
                    r--;
                    cnt2--;
                }else{
                    break;
                }
            }

            if( l >= 0 && r >= 0 && s.charAt(l) != t.charAt(r)){
                return false;
            }

            if( l>=0 != r>=0){
                return false;
            }

            l--;
            r--;
        }
        return true;
    }
}