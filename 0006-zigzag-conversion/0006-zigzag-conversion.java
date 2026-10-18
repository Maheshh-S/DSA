class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows >= s.length()){
            return s;
        }
        StringBuilder[] row = new StringBuilder[numRows];
        for(int i = 0 ; i < numRows; i++){
            row[i] = new StringBuilder();
        }//O(m)

        int currRow = 0;
        int step = 1;

        for(char ch : s.toCharArray()){//O(n)
            row[currRow].append(ch);

            if(currRow == 0){
                step =1;
            }else if(currRow == numRows - 1){
                step = -1;
            }

            currRow += step;
        }
//all rows sq to form the fin res
        StringBuilder res = new StringBuilder();
        for(StringBuilder ro : row){
            res.append(ro);
        }
        return res.toString();
    }
}

/* 
so track the current row
a direct flag up down

PAHNAPLSIIGYIR
PAYPALISHIRING
p   a   h   n 
a p  l s  i i g
y    i  r



 */