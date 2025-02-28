class Solution {
    public int[] numberOfPairs(int[] nums) {

          Arrays.sort(nums);
          int pairs = 0;
          int i  = 0;

          int n = nums.length;

          while(i < n-1){
            if(nums[i] == nums[i +1]){
                pairs++;
                i +=2;
            }else{
                i++;
            }
          }
int leftovers = n - (2 * pairs);
return new int[] {pairs,leftovers};

    }
}