class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer > RemIdx = new HashMap<>();

        int sum = 0;

        RemIdx.put(0,-1);
        for(int i = 0 ; i < nums.length; i++){
            sum += nums[i];

            int rem = sum %k;
            if(RemIdx.containsKey(rem)){
                if(i - RemIdx.get(rem) > 1){
                    return true;
                }
            }else{
                RemIdx.put(rem,i);
            }
        }

return false;
    }
}