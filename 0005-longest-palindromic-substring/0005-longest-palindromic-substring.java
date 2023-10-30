class Solution {
    int start=0;
    int max=1;
    public void oddevenpal(String s,int i,int j){
        if(i<0 || j>=s.length()) return ; // out of length index
		
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        if(max<(j-i-1)){
            max=(j-i-1);
            start=i+1;
        }
    }
    public String longestPalindrome(String s) {
         
         int n=s.length();
         for(int i=0;i<n;i++){
            oddevenpal(s,i-1,i+1); // check of odd length
            oddevenpal(s,i,i+1); // check even length
         }

         return s.substring(start,start+max);
    }
}