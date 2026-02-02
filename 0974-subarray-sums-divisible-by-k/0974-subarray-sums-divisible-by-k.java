class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        

        int n = nums.length;

        int sum =0;

        int count = 0;

        Map<Integer , Integer> map = new HashMap<>();

        map.put(0,1);


        for(int num : nums){
            sum += num;

            int rem = ((sum % k) + k) % k;

            if(map.containsKey(rem)){
                count += map.get(rem);
            }

            map.put(rem, map.getOrDefault(rem , 0) +1);
        }
        return count;
    }
}