class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int cnt = 0 ;
        int prefix = 0;

        HashMap<Integer , Integer> map = new HashMap<>();

        map.put( 0 , 1);

        for(int r=0;r<n;r++){
            prefix += nums[r];

            int target = prefix - k;

            if(map.containsKey(target)){
                cnt += map.get(target);
            }
            
            map.put(prefix , map.getOrDefault(prefix, 0) +1);


        }
        return cnt;
    }
}