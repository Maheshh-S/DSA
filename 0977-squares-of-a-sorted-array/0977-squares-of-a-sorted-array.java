class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int n  = nums.length;
        int[] res = new int[n];

        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(int num : nums){
int sq = 0;
            if(num >= 0){
                 sq = num * num;
                pos.add(sq);
            }else{
                sq = num * num;
                neg.add(sq);
            }
        }


        Collections.reverse(neg);
        // System.out.print(neg);


        int pl = pos.size();
        int nl = neg.size();

        int i =0;
        int j=0;
        int idx = 0;

        if(pl == 0){
            while(j < nl){
                res[idx++] = neg.get(j);
                j++;
            }
            return res;
        }else if(nl == 0){
            while(i < pl){
                res[idx++] = pos.get(i);
                i++;
            }
        }


        while(i < pl && j < nl){
            if(pos.get(i) <= neg.get(j)){
                res[idx++] = pos.get(i);
                i++;
            }else{
                res[idx++] = neg.get(j);
                j++;
            }
        }

        while( i < pl){
            res[idx++] = pos.get(i);
            i++;
        }

        while(j < nl){
            res[idx++] = neg.get(j);
            j++;
        }

    return res;
    }

}