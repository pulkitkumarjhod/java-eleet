class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> ls = new ArrayList<Integer>();
        
        int n = matrix.length-1;
        int m = matrix[0].length-1;
        int rowBegin = 0;
        int rowEnd = n;
        int colBegin =0;
        int colEnd = m;
        
        if(matrix.length == 0){
            return ls;
        }
        
        while(colBegin <= colEnd && rowBegin <= rowEnd){
            
            
            
            for(int j = colBegin; j<=colEnd ; j++){
                ls.add(matrix[rowBegin][j]);
            }
            rowBegin++;
            
            for(int j = rowBegin; j<=rowEnd ; j++){
                ls.add(matrix[j][colEnd]);
            }
            colEnd--;
            
            
            if(rowBegin<=rowEnd){
                for(int j = colEnd; j>=colBegin ; j--){
                  ls.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;
            
            if(colBegin<= colEnd){
                for(int j = rowEnd; j>=rowBegin ; j--){
                    ls.add(matrix[j][colBegin]);
                }
            }
            colBegin++;
        }
        return ls;
    }
}