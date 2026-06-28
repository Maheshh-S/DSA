class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int l = 0;
        int n = nums.length;
        int sum = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
map.put(0,-1);
        for(int r=0;r<n;r++){
            sum += nums[r];
            int rem = sum % k;

        
            if(map.containsKey(rem)){
                if(r - map.get(rem) >=2){
                    return true;
                }
            }else{
                map.put(rem , r);
            }
        }
        return false;
    }
}