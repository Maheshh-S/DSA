class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> ans = new HashSet<>();
        for(int n : a){
            ans.add(n);
        }
        
        for(int m : b){
            ans.add(m);
        }
        for(int k : ans){
            res.add(k);
        }
        return res;
    }
}