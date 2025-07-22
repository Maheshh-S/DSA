class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
             int score = 0;
             Set<Integer> s = new LinkedHashSet<>();

             for( int k : nums){
                s.add(k); 
             }

             for(int sum : s){
                 
                    score += sum;

             }



return score;
    }
}