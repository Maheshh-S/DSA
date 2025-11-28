class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int n = candies.length;

        List<Boolean> res = new ArrayList<>();
        boolean flag = true;
        // int currMax = candies[0] + extraCandies;

        for (int i = 0; i < n; i++) {
            int currcandie = candies[i] + extraCandies;
            for (int j = 0; j < n; j++) {
                if (currcandie < candies[j]) {
                    flag = false;
                    break;
                }else{
                    flag = true;
                }
            }
            if (flag == true) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }
}