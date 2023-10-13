class Solution {
    public boolean validPalindrome(String s) {
        int x = s.length();
        int j = s.length()-1;
        int i=0;
        
        int count =0;
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                if(count == 1){
                    return false;
                }
                else{
                    count ++;
                    if(isPalindrome(s,i+1,j)|| isPalindrome(s,i,j-1)){
                        return true;
                    }
                    else return false;
                }
            }
        
            
            
        }
        return true;
    }
    
    public boolean isPalindrome(String s, int i, int j){
       while(i<j) {
            if(s.charAt(i)!=s.charAt(j)){
               return false;
            }
            i++; j--;
        }
        return true;
    }
    
    
}
