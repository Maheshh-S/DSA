class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        // int m = t.length();

        HashMap<Character , Character> map = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            
            if(map.containsKey(c1)){
                if(map.get(c1) != (c2)){
                    return false;
                }
            }else{
                if(map.containsValue(c2)) {
                    return false;
                }
            map.put(c1 , c2);   
            }
        }
        return true;
    }
}