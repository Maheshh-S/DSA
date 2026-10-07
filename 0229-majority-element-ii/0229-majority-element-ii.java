class Solution {
    public List<Integer> majorityElement(int[] nums) {

        HashMap<Integer , Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0) +1);
        }
        int n = nums.length;
        for(int k : map.keySet()){
            if(map.get(k) > n/3){
                ans.add(k);
            }
        }
        
        return ans;
    }
}

// 3 / 3 = 1