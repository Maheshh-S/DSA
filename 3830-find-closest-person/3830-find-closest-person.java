class Solution {
    public int findClosest(int x, int y, int z) {
        
        int p1=1;
        int p2=2;
        int both = 0;

        int pp1 = Math.abs(z-x);
        int pp2 = Math.abs(z-y);

        if(pp1 == pp2) return both;

        if(pp1 < pp2){
            return p1;
        }else{
            return p2;
        }



    }
}