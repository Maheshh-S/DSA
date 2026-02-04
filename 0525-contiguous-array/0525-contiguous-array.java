class Solution {
    public int findMaxLength(int[] nums) {
        

        int n = nums.length;

        Map<Integer , Integer> map = new HashMap<>();

        map.put(0,-1);
        int sum = 0;
        int maxLen = 0;


        for(int i =0 ; i<n;i++){

                if(nums[i] == 0){
                    nums[i] = -1;
                }

                sum += nums[i];


                if(map.containsKey(sum)){
                    int prevI = map.get(sum);
                    int len = i - prevI;

                    maxLen = Math.max(maxLen ,  len);
                }else{
                    map.put(sum , i);
                }
        }
return maxLen;

    }
}