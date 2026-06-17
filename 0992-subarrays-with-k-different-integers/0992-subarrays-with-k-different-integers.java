class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return check(nums, k) - check(nums, k-1);
    }
        public int check(int[] nums, int k){
        int n = nums.length;

        int ans = 0;
        int currLen = 0;

        int l = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < n ; i++){

            map.put(nums[i] , map.getOrDefault(nums[i] , 0) +1);
           
            while(map.size() > k){
                map.put(nums[l] , map.get(nums[l]) -1);
                if(map.get(nums[l]) == 0){
                    map.remove(nums[l]);
                }
                l++;
            }

             currLen += i - l +1;
        }
        return currLen;
    }
}