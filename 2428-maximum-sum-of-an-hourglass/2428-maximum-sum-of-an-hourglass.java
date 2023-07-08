class Solution {
    public int maxSum(int[][] glid) {
        int sum = 0;
        int hourglass = 0;
        for(int i = 0; i<=glid.length-3;i++){
            for(int j =0; j<=glid[i].length-3;j++){
                hourglass = glid[i][j]+glid[i][j+1]+glid[i][j+2]+glid[i+1][j+1]+glid[i+2][j]+glid[i+2][j+1]+glid[i+2][j+2];
                sum = Math.max(sum, hourglass);
                
            }
           
        }
         return sum;
    }
}