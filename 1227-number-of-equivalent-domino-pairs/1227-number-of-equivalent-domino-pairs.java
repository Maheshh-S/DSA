class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[][] count = new int[9][9];
        int total = 0;

        for(int[] pair : dominoes) {
            int x = pair[0] - 1, y = pair[1] - 1;

            total += count[x][y];
            if(x != y) {count[x][y]++; count[y][x]++;}
            else count[x][x]++;
        }
        return total;
    }
}