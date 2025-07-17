import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer > map = new HashMap<>();
int n = nums.length;
int ans = 0;
        for(int i = 0; i < n; i++){
            // int num = arr[i];

            // if(map.cotainsKey(num)){
            //     map.put(num,map.get(nums)+1);
            // }else{
            //     map.put(num,1);
            // }

            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
                
        }
        // Set<Interger> keyset = map.keyset();

        for(Integer key : map.keySet()){
            if(map.get(key) > n/2){
                 ans = key;
            }
        }
        return  ans;
    }
}